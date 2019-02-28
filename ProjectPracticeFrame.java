/*
Final Project for COMP 131;

Project name: GO Rex Coco!
Project type: game;
Group member: Samuel Miller, Enrique Goudet, William Black, Di Hu;

Intro:
This project is inspired by the Chrome off-line t-rex running game
and Japanese sound-control game YASUHATI / With your voice!

References:
detecting sound code:
https://coderanch.com/t/615528/java/Detecting-sound-microphone-Java
threads in the main class:
https://stackoverflow.com/questions/9664036/how-to-run-two-methods-simultaneously
https://stackoverflow.com/questions/18025337/fixing-error-unreported-exception-interruptedexception
*/

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JFrame;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ProjectPracticeFrame
{
    public static void main( String[] args ) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(900, 600);
        frame.setTitle("Graphics Fun");
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ProjectPracticeComponent component = new ProjectPracticeComponent();
        frame.add(component);

        //frame.getContentPane().add(new KeyComponent());
        //frame.pack();

        frame.setVisible(true);

        Thread thread1 = new Thread() {
            public void run() {
                try {
                    component.update();
                } catch (InterruptedException e) {
                    // this part is executed when an exception (in this example InterruptedException) occurs
                }
            }
        };





//网上扒的

            Thread thread2 = new Thread() {
                public void run() {
                    ByteArrayOutputStream byteArrayOutputStream;
                    TargetDataLine targetDataLine;
                    int cnt;
                    boolean stopCapture = false;
                    byte tempBuffer[] = new byte[8000];
                    int countzero, countdownTimer;
                    short convert[] = new short[tempBuffer.length];

                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        stopCapture = false;
                        countdownTimer = 0;
                        while (!stopCapture) {
                            AudioFormat audioFormat = new AudioFormat(16000.0F, 16, 1, true, false);
                            DataLine.Info dataLineInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
                            targetDataLine = (TargetDataLine) AudioSystem.getLine(dataLineInfo);
                            targetDataLine.open(audioFormat);
                            targetDataLine.start();
                            cnt = targetDataLine.read(tempBuffer, 0, tempBuffer.length);
                            byteArrayOutputStream.write(tempBuffer, 0, cnt);
                            try {
                                countzero = 0;
                                for (int i = 0; i < tempBuffer.length; i++) {
                                    convert[i] = tempBuffer[i];
                                    if (convert[i] == 0) {
                                        countzero++;
                                    }
                                }

                                countdownTimer++;
                                //s.setSoundData(countzero);
//                    System.out.println(s.getSoundData());
                                //System.out.println(countzero + " " + countdownTimer);
                                component.setHeight(countzero);

                            } catch (StringIndexOutOfBoundsException e) {
                                System.out.println(e.getMessage());
                            }
                            Thread.sleep(50);
                            targetDataLine.close();
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            thread1.start();
            thread2.start();

        thread1.join();
        thread2.join();

//        PrintWriter record = null;
//
//        try {
//            record = new PrintWriter(new FileOutputStream("record.txt"));
//        }
//        catch (FileNotFoundException e)
//        {
//            System.out.println("Error opening the file stuff.txt.");
//            System.exit(0);
//        }
//
//        record.println("ok");
//        System.out.println("fine");
//        //System.out.println(component.getScoreNow());
//        record.close();
        }
    }

