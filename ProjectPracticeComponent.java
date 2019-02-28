import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.util.Random;
import java.awt.Font;
import java.util.Timer;

public class ProjectPracticeComponent extends JComponent //LAB 6 QUESTION 5B
{

        int move;
        int move1;
        int speed = 5;
        int speed1 = 5;
        int pattern;
        int value;
        boolean again = true;
        Random r = new Random();
        Timer t = new Timer();
        Color bc = new Color(238,238,238);
        Color word = new Color(150, 150, 150);
        Scanner sc = new Scanner(System.in);
        int headHeight = 411;
        long createdMillis = System.currentTimeMillis();
        int counter = 0;
        int baseline = 220;


        public int score()
        {
        long nowMillis = System.currentTimeMillis();
        return (int)((nowMillis - this.createdMillis) / 100);
        }


    public void update() throws InterruptedException
        {
            while(again)
            {
                for(int i=1;i<=2975;i++)
                {
                    move = i;
                    //move1 = i%125;
                    if(i==1)
                    {
                        pattern = r.nextInt(6);
                    }

                    if(((1282-move) == 105) && (move1 <= 85))
                    {
                        System.out.print("GAME OVER!");
                        again = sc.nextBoolean();
//                        scoreNow = this.score();
                    }
                    else if(((2000-move) == 105) && (75 <= move1 && move1 <= 200))
                    {
                        System.out.print("GAME OVER!");
                        again = sc.nextBoolean();
                    }
                    else if(((2350-move) == 105) && (75 <= move1 && move1 <= 200))
                    {
                        System.out.print("GAME OVER!");
                        again = sc.nextBoolean();
                    }
                    else if(((2700-move) == 105) && (75 <= move1 && move1 <= 200))
                    {
                        System.out.print("GAME OVER!");
                        again = sc.nextBoolean();
                    }

                    if(pattern==0)
                    {
                        if(((1780-move)==105) && (move1 <= 90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2180-move)==105) && (move1<=80))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2530-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2880-move)==105) && (move1<=100))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                    }
                    else if(pattern==1)
                    {
                        if(((1780-move)==105) && (move1 <= 90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2230-move)==105) && (move1<=80))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2550-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2830-move)==105) && (move1<=100))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                    }
                    else if(pattern==2)
                    {
                        if(((1780-move)==105) && (move1 <= 90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2230-move)==105) && (move1<=80))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2530-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2830-move)==105) && (move1<=100))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                    }
                    else if(pattern==3)
                    {
                        if(((1780-move)==105) && (move1 <= 90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2180-move)==105) && (move1<=80))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2530-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2880-move)==105) && (move1<=100))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                    }
                    else if(pattern==4)
                    {
                        if(((1830-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2180-move)==105) && (move1<=80))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2480-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2880-move)==105) && (move1<=100))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                    }
                    else if(pattern==5)
                    {
                        if(((1830-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2180-move)==105) && (move1<=80))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2480-move)==105) && (move1<=90))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                        else if(((2880-move)==105) && (move1<=100))
                        {
                            System.out.print("GAME OVER!");
                            again = sc.nextBoolean();
                        }
                    }

                    repaint();
                    try { Thread.sleep(speed);}
                    catch(InterruptedException e){}
                }
                counter ++;
                //System.out.println("Counter: " + counter);
                //
                // System.out.println("Speed: " + speed);


            }


        }



//        public int getScoreNow()
//        {
//            return scoreNow;
//        }


        public void setHeight(int h)
        {
            move1 = headHeight - h/10 - baseline;
            //System.out.println(move1);
        }



        public void paintComponent( Graphics g )
        {
            Graphics2D g2 = (Graphics2D) g;
            super.paintComponent(g2);

            Font f = new Font ("TIMES NEW ROMAN", Font.BOLD, 40);
            g2.setFont(f);
            g2.setColor(Color.BLACK);

            Font f0 = new Font ("Monaco", Font.PLAIN, 20);
            g2.setFont(f0);
            g2.drawString(Integer.toString(this.score()), 800, 100);


            //Clouds
            Ellipse2D.Double e1 = new Ellipse2D.Double(2100-move, 100, 30, 30);
            g2.fill(e1);

            Ellipse2D.Double e2 = new Ellipse2D.Double(2115-move, 80, 50, 50);
            g2.fill(e2);

            Ellipse2D.Double e3 = new Ellipse2D.Double(2150-move, 100, 30, 30);
            g2.fill(e3);

            g2.setColor(Color.WHITE); //Change color to white

            Ellipse2D.Double e1Fill = new Ellipse2D.Double(2103-move, 102, 25, 25);
            g2.fill(e1Fill);

            Ellipse2D.Double e2Fill = new Ellipse2D.Double(2118-move, 82, 45, 45);
            g2.fill(e2Fill);

            Ellipse2D.Double e3Fill = new Ellipse2D.Double(2153-move, 102, 25, 25);
            g2.fill(e3Fill);

            g2.setColor(Color.BLACK); //Change color to black

            Ellipse2D.Double c1 = new Ellipse2D.Double(1000-move, 80, 40, 40);
            g2.fill(c1);

            Ellipse2D.Double c2 = new Ellipse2D.Double(1025-move, 50, 70, 70);
            g2.fill(c2);

            Ellipse2D.Double c3 = new Ellipse2D.Double(1080-move, 80, 40, 40);
            g2.fill(c3);

            g2.setColor(Color.WHITE); //Change color to white

            Ellipse2D.Double c1Fill = new Ellipse2D.Double(1003-move, 82, 35, 35);
            g2.fill(c1Fill);

            Ellipse2D.Double c2Fill = new Ellipse2D.Double(1028-move, 52, 65, 65);
            g2.fill(c2Fill);

            Ellipse2D.Double c3Fill = new Ellipse2D.Double(1083-move, 82, 35, 35);
            g2.fill(c3Fill);

            g2.setColor(Color.BLACK); //Change color to white

            Ellipse2D.Double s1 = new Ellipse2D.Double(2500-move, 80, 40, 40);
            g2.fill(s1);

            Ellipse2D.Double s2 = new Ellipse2D.Double(2525-move, 50, 70, 70);
            g2.fill(s2);

            Ellipse2D.Double s3 = new Ellipse2D.Double(2580-move, 80, 40, 40);
            g2.fill(s3);

            g2.setColor(Color.WHITE); //Change color to white

            Ellipse2D.Double s1Fill = new Ellipse2D.Double(2503-move, 82, 35, 35);
            g2.fill(s1Fill);

            Ellipse2D.Double s2Fill = new Ellipse2D.Double(2528-move, 52, 65, 65);
            g2.fill(s2Fill);

            Ellipse2D.Double s3Fill = new Ellipse2D.Double(2583-move, 82, 35, 35);
            g2.fill(s3Fill);

            //Dirt
            g2.setColor(Color.BLACK); //Change color to black

            Rectangle ground = new Rectangle(0, 500, 1200, 1);
            g2.fill(ground);

            Ellipse2D.Double dirt1 = new Ellipse2D.Double(50-move, 510, 5, 5);
            g2.fill(dirt1);

            Ellipse2D.Double dirt2 = new Ellipse2D.Double(250-move, 520, 5, 5);
            g2.fill(dirt2);

            Ellipse2D.Double dirt3 = new Ellipse2D.Double(350-move, 515, 5, 5);
            g2.fill(dirt3);

            Ellipse2D.Double dirt4 = new Ellipse2D.Double(500-move, 510, 5, 5);
            g2.fill(dirt4);

            Ellipse2D.Double dirt5 = new Ellipse2D.Double(600-move, 515, 5, 5);
            g2.fill(dirt5);

            Ellipse2D.Double dirt6 = new Ellipse2D.Double(800-move, 520, 5, 5);
            g2.fill(dirt6);

            Ellipse2D.Double dirt7 = new Ellipse2D.Double(950-move, 510, 5, 5);
            g2.fill(dirt7);

            Ellipse2D.Double dirt8 = new Ellipse2D.Double(1100-move, 510, 5, 5);
            g2.fill(dirt8);

            Ellipse2D.Double dirt9 = new Ellipse2D.Double(1200-move, 515, 5, 5);
            g2.fill(dirt9);

            Ellipse2D.Double dirt10 = new Ellipse2D.Double(1450-move, 520, 5, 5);
            g2.fill(dirt10);

            Ellipse2D.Double dirt11 = new Ellipse2D.Double(1600-move, 510, 5, 5);
            g2.fill(dirt11);

            Ellipse2D.Double dirt12 = new Ellipse2D.Double(1750-move, 520, 5, 5);
            g2.fill(dirt12);

            Ellipse2D.Double dirt13 = new Ellipse2D.Double(2000-move, 515, 5, 5);
            g2.fill(dirt13);

            Ellipse2D.Double dirt14 = new Ellipse2D.Double(2150-move, 515, 5, 5);
            g2.fill(dirt14);

            Ellipse2D.Double dirt15 = new Ellipse2D.Double(2350-move, 510, 5, 5);
            g2.fill(dirt15);

            Ellipse2D.Double dirt16 = new Ellipse2D.Double(2500-move, 520, 5, 5);
            g2.fill(dirt16);

            Ellipse2D.Double dirt17 = new Ellipse2D.Double(2725-move, 510, 5, 5);
            g2.fill(dirt17);

            Ellipse2D.Double dirt18 = new Ellipse2D.Double(2900-move, 515, 5, 5);
            g2.fill(dirt18);

            Ellipse2D.Double dirt19 = new Ellipse2D.Double(3150-move, 520, 5, 5);
            g2.fill(dirt19);

            Ellipse2D.Double dirt20 = new Ellipse2D.Double(3300-move, 520, 5, 5);
            g2.fill(dirt20);

            Ellipse2D.Double dirt21 = new Ellipse2D.Double(3400-move, 510, 5, 5);
            g2.fill(dirt21);

            Ellipse2D.Double dirt22 = new Ellipse2D.Double(3550-move, 515, 5, 5);
            g2.fill(dirt22);

            Ellipse2D.Double dirt23 = new Ellipse2D.Double(3750-move, 510, 5, 5);
            g2.fill(dirt23);

            Ellipse2D.Double dirt24 = new Ellipse2D.Double(3900-move, 520, 5, 5);
            g2.fill(dirt24);

            Ellipse2D.Double dirt25 = new Ellipse2D.Double(4000-move, 520, 5, 5);
            g2.fill(dirt25);


            //Rectangle behind cactus
            g2.setColor(new Color(238, 238, 238));
            Rectangle r2 = new Rectangle(1282-move,416,48,84);
            g2.fill(r2);
            //Start Cactus

            g2.setColor(Color.BLACK); //Color change to Black

            Rectangle cactusBody = new Rectangle(1300-move, 420, 13, 80);
            g2.draw(cactusBody);
            g2.fill(cactusBody);

            Rectangle cactusBody1 = new Rectangle(1302-move, 416, 9, 4);
            g2.draw(cactusBody1);
            g2.fill(cactusBody1);

            Rectangle cactusArmR = new Rectangle(1313-move, 465, 10, 10);
            g2.draw(cactusArmR);
            g2.fill(cactusArmR);

            Rectangle cactusArmR1 = new Rectangle(1323-move, 435, 7, 35);
            g2.draw(cactusArmR1);
            g2.fill(cactusArmR1);

            Rectangle cactusArmR2 = new Rectangle(1323-move, 468, 5, 5);
            g2.draw(cactusArmR2);
            g2.fill(cactusArmR2);

            Rectangle cactusArmR3 = new Rectangle(1324-move, 432, 5, 2);
            g2.draw(cactusArmR3);
            g2.fill(cactusArmR3);

            Rectangle cactusArmL = new Rectangle(1289-move, 465, 10, 10);
            g2.draw(cactusArmL);
            g2.fill(cactusArmL);

            Rectangle cactusArmL1 = new Rectangle(1282-move, 440, 7, 30);
            g2.draw(cactusArmL1);
            g2.fill(cactusArmL1);

            Rectangle cactusArmL2 = new Rectangle(1285-move, 468, 5, 5);
            g2.draw(cactusArmL2);
            g2.fill(cactusArmL2);

            Rectangle cactusArmL3 = new Rectangle(1283-move, 437, 5, 2);
            g2.draw(cactusArmL3);
            g2.fill(cactusArmL3);

            //Pattern for obstacles


            if(pattern == 0)
            {
                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r3 = new Rectangle(1780-move,410,65,90);
                g2.fill(r3);
                g2.setColor(Color.BLACK);

                //Random Cactus 1
                Rectangle cBody = new Rectangle(1800-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(1780-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(1780-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(1820-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(1830-move, 435, 15, 40);
                g2.fill(cHandR);

                g2.setColor(bc);
                Rectangle f1 = new Rectangle(1800-move,410,3,3);
                g2.fill(f1);
                Rectangle f2 = new Rectangle(1817-move,410,3,3);
                g2.fill(f2);
                Rectangle f3 = new Rectangle(1780-move,445,3,3);
                g2.fill(f3);
                Rectangle f4 = new Rectangle(1792-move,445,3,3);
                g2.fill(f4);
                Rectangle f5 = new Rectangle(1830-move,435,3,3);
                g2.fill(f5);
                Rectangle f6 = new Rectangle(1842-move,435,3,3);
                g2.fill(f6);
                Rectangle b1 = new Rectangle(1780-move,472,3,3);
                g2.fill(b1);
                Rectangle b2 = new Rectangle(1842-move,472,3,3);
                g2.fill(b2);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 2
                g2.setColor(bc);
                Rectangle r4 = new Rectangle(2180-move,420,105,80);
                g2.fill(r4);
                g2.setColor(Color.BLACK);
                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(2200-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(2180-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(2180-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(2260-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(2270-move, 435, 15, 40);
                g2.fill(cHandR2);

                g2.setColor(bc);
                Rectangle f11 = new Rectangle(2200-move,420,3,3);
                g2.fill(f11);
                Rectangle f21 = new Rectangle(2257-move,420,3,3);
                g2.fill(f21);
                Rectangle f31 = new Rectangle(2180-move,445,3,3);
                g2.fill(f31);
                Rectangle f41 = new Rectangle(2192-move,445,3,3);
                g2.fill(f41);
                Rectangle f51 = new Rectangle(2270-move,435,3,3);
                g2.fill(f51);
                Rectangle f61 = new Rectangle(2282-move,435,3,3);
                g2.fill(f61);
                Rectangle b11 = new Rectangle(2180-move,472,3,3);
                g2.fill(b11);
                Rectangle b21 = new Rectangle(2282-move,472,3,3);
                g2.fill(b21);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 3
                g2.setColor(bc);
                Rectangle r5 = new Rectangle(2530-move,410,75,90);
                g2.fill(r5);
                g2.setColor(Color.BLACK);

                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(2550-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(2530-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(2530-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(2580-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(2590-move, 435, 15, 40);
                g2.fill(cHandR3);

                g2.setColor(bc);
                Rectangle f12 = new Rectangle(2550-move,410,3,3);
                g2.fill(f12);
                Rectangle f22 = new Rectangle(2577-move,410,3,3);
                g2.fill(f22);
                Rectangle f32 = new Rectangle(2530-move,445,3,3);
                g2.fill(f32);
                Rectangle f42 = new Rectangle(2542-move,445,3,3);
                g2.fill(f42);
                Rectangle f52 = new Rectangle(2590-move,435,3,3);
                g2.fill(f52);
                Rectangle f62 = new Rectangle(2602-move,435,3,3);
                g2.fill(f62);
                Rectangle b12 = new Rectangle(2530-move,472,3,3);
                g2.fill(b12);
                Rectangle b22 = new Rectangle(2602-move,472,3,3);
                g2.fill(b22);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 4
                g2.setColor(bc);
                Rectangle r6 = new Rectangle(2880-move,400,85,100);
                g2.fill(r6);
                g2.setColor(Color.BLACK);

                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2900-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2880-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2880-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2940-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2950-move, 435, 15, 40);
                g2.fill(cHandR4);

                g2.setColor(bc);
                Rectangle f13 = new Rectangle(2900-move,400,3,3);
                g2.fill(f13);
                Rectangle f23 = new Rectangle(2937-move,400,3,3);
                g2.fill(f23);
                Rectangle f33 = new Rectangle(2880-move,445,3,3);
                g2.fill(f33);
                Rectangle f43 = new Rectangle(2892-move,445,3,3);
                g2.fill(f43);
                Rectangle f53 = new Rectangle(2950-move,435,3,3);
                g2.fill(f53);
                Rectangle f63 = new Rectangle(2962-move,435,3,3);
                g2.fill(f63);
                Rectangle b13 = new Rectangle(2880-move,472,3,3);
                g2.fill(b13);
                Rectangle b23 = new Rectangle(2962-move,472,3,3);
                g2.fill(b23);
                g2.setColor(Color.BLACK);
            }

            else if(pattern == 1)
            {
                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r7 = new Rectangle(1780-move,410,65,90);
                g2.fill(r7);
                g2.setColor(Color.BLACK);
                //Random Cactus 1
                Rectangle cBody = new Rectangle(1800-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(1780-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(1780-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(1820-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(1830-move, 435, 15, 40);
                g2.fill(cHandR);

                g2.setColor(bc);
                Rectangle f1 = new Rectangle(1800-move,410,3,3);
                g2.fill(f1);
                Rectangle f2 = new Rectangle(1817-move,410,3,3);
                g2.fill(f2);
                Rectangle f3 = new Rectangle(1780-move,445,3,3);
                g2.fill(f3);
                Rectangle f4 = new Rectangle(1792-move,445,3,3);
                g2.fill(f4);
                Rectangle f5 = new Rectangle(1830-move,435,3,3);
                g2.fill(f5);
                Rectangle f6 = new Rectangle(1842-move,435,3,3);
                g2.fill(f6);
                Rectangle b1 = new Rectangle(1780-move,472,3,3);
                g2.fill(b1);
                Rectangle b2 = new Rectangle(1842-move,472,3,3);
                g2.fill(b2);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 2
                g2.setColor(bc);
                Rectangle r8 = new Rectangle(2830-move,420,105,80);
                g2.fill(r8);
                g2.setColor(Color.BLACK);
                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(2850-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(2830-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(2830-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(2910-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(2920-move, 435, 15, 40);
                g2.fill(cHandR2);

                g2.setColor(bc);
                Rectangle f12 = new Rectangle(2850-move,420,3,3);
                g2.fill(f12);
                Rectangle f22 = new Rectangle(2907-move,420,3,3);
                g2.fill(f22);
                Rectangle f32 = new Rectangle(2830-move,445,3,3);
                g2.fill(f32);
                Rectangle f42 = new Rectangle(2842-move,445,3,3);
                g2.fill(f42);
                Rectangle f52 = new Rectangle(2920-move,435,3,3);
                g2.fill(f52);
                Rectangle f62 = new Rectangle(2932-move,435,3,3);
                g2.fill(f62);
                Rectangle b12 = new Rectangle(2830-move,472,3,3);
                g2.fill(b12);
                Rectangle b22 = new Rectangle(2932-move,472,3,3);
                g2.fill(b22);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 3
                g2.setColor(bc);
                Rectangle r9 = new Rectangle(2230-move,410,75,90);
                g2.fill(r9);
                g2.setColor(Color.BLACK);
                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(2250-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(2230-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(2230-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(2280-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(2290-move, 435, 15, 40);
                g2.fill(cHandR3);

                g2.setColor(bc);
                Rectangle f13 = new Rectangle(2250-move,410,3,3);
                g2.fill(f13);
                Rectangle f23 = new Rectangle(2277-move,410,3,3);
                g2.fill(f23);
                Rectangle f33 = new Rectangle(2230-move,445,3,3);
                g2.fill(f33);
                Rectangle f43 = new Rectangle(2242-move,445,3,3);
                g2.fill(f43);
                Rectangle f53 = new Rectangle(2290-move,435,3,3);
                g2.fill(f53);
                Rectangle f63 = new Rectangle(2302-move,435,3,3);
                g2.fill(f63);
                Rectangle b13 = new Rectangle(2230-move,472,3,3);
                g2.fill(b13);
                Rectangle b23 = new Rectangle(2302-move,472,3,3);
                g2.fill(b23);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 4
                g2.setColor(bc);
                Rectangle r10 = new Rectangle(2550-move,400,85,100);
                g2.fill(r10);
                g2.setColor(Color.BLACK);
                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2570-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2550-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2550-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2610-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2620-move, 435, 15, 40);
                g2.fill(cHandR4);

                g2.setColor(bc);
                Rectangle f14 = new Rectangle(2570-move,400,3,3);
                g2.fill(f14);
                Rectangle f24 = new Rectangle(2607-move,400,3,3);
                g2.fill(f24);
                Rectangle f34 = new Rectangle(2550-move,445,3,3);
                g2.fill(f34);
                Rectangle f44 = new Rectangle(2562-move,445,3,3);
                g2.fill(f44);
                Rectangle f54 = new Rectangle(2620-move,435,3,3);
                g2.fill(f54);
                Rectangle f64 = new Rectangle(2632-move,435,3,3);
                g2.fill(f64);
                Rectangle b14 = new Rectangle(2550-move,472,3,3);
                g2.fill(b14);
                Rectangle b24 = new Rectangle(2632-move,472,3,3);
                g2.fill(b24);
                g2.setColor(Color.BLACK);

            }

            else if(pattern == 2)
            {
                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r11 = new Rectangle(2830-move,410,65,90);
                g2.fill(r11);
                g2.setColor(Color.BLACK);
                //Random Cactus 1
                Rectangle cBody = new Rectangle(2850-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(2830-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(2830-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(2870-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(2880-move, 435, 15, 40);
                g2.fill(cHandR);

                g2.setColor(bc);
                Rectangle f1 = new Rectangle(2850-move,410,3,3);
                g2.fill(f1);
                Rectangle f2 = new Rectangle(2867-move,410,3,3);
                g2.fill(f2);
                Rectangle f3 = new Rectangle(2830-move,445,3,3);
                g2.fill(f3);
                Rectangle f4 = new Rectangle(2842-move,445,3,3);
                g2.fill(f4);
                Rectangle f5 = new Rectangle(2880-move,435,3,3);
                g2.fill(f5);
                Rectangle f6 = new Rectangle(2892-move,435,3,3);
                g2.fill(f6);
                Rectangle b1 = new Rectangle(2830-move,472,3,3);
                g2.fill(b1);
                Rectangle b2 = new Rectangle(2892-move,472,3,3);
                g2.fill(b2);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 2
                g2.setColor(bc);
                Rectangle r12 = new Rectangle(1780-move,420,105,80);
                g2.fill(r12);
                g2.setColor(Color.BLACK);
                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(1800-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(1780-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(1780-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(1860-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(1870-move, 435, 15, 40);
                g2.fill(cHandR2);

                g2.setColor(bc);
                Rectangle f12 = new Rectangle(1800-move,420,3,3);
                g2.fill(f12);
                Rectangle f22 = new Rectangle(1857-move,420,3,3);
                g2.fill(f22);
                Rectangle f32 = new Rectangle(1780-move,445,3,3);
                g2.fill(f32);
                Rectangle f42 = new Rectangle(1792-move,445,3,3);
                g2.fill(f42);
                Rectangle f52 = new Rectangle(1870-move,435,3,3);
                g2.fill(f52);
                Rectangle f62 = new Rectangle(1882-move,435,3,3);
                g2.fill(f62);
                Rectangle b12 = new Rectangle(1780-move,472,3,3);
                g2.fill(b12);
                Rectangle b22 = new Rectangle(1882-move,472,3,3);
                g2.fill(b22);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 3
                g2.setColor(bc);
                Rectangle r13 = new Rectangle(2230-move,410,75,90);
                g2.fill(r13);
                g2.setColor(Color.BLACK);
                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(2250-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(2230-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(2230-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(2280-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(2290-move, 435, 15, 40);
                g2.fill(cHandR3);

                g2.setColor(bc);
                Rectangle f13 = new Rectangle(2250-move,410,3,3);
                g2.fill(f13);
                Rectangle f23 = new Rectangle(2277-move,410,3,3);
                g2.fill(f23);
                Rectangle f33 = new Rectangle(2230-move,445,3,3);
                g2.fill(f33);
                Rectangle f43 = new Rectangle(2242-move,445,3,3);
                g2.fill(f43);
                Rectangle f53 = new Rectangle(2290-move,435,3,3);
                g2.fill(f53);
                Rectangle f63 = new Rectangle(2302-move,435,3,3);
                g2.fill(f63);
                Rectangle b13 = new Rectangle(2230-move,472,3,3);
                g2.fill(b13);
                Rectangle b23 = new Rectangle(2302-move,472,3,3);
                g2.fill(b23);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 4
                g2.setColor(bc);
                Rectangle r14 = new Rectangle(2530-move,400,85,100);
                g2.fill(r14);
                g2.setColor(Color.BLACK);
                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2550-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2530-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2530-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2590-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2600-move, 435, 15, 40);
                g2.fill(cHandR4);

                g2.setColor(bc);
                Rectangle f14 = new Rectangle(2550-move,400,3,3);
                g2.fill(f14);
                Rectangle f24 = new Rectangle(2587-move,400,3,3);
                g2.fill(f24);
                Rectangle f34 = new Rectangle(2530-move,445,3,3);
                g2.fill(f34);
                Rectangle f44 = new Rectangle(2542-move,445,3,3);
                g2.fill(f44);
                Rectangle f54 = new Rectangle(2600-move,435,3,3);
                g2.fill(f54);
                Rectangle f64 = new Rectangle(2612-move,435,3,3);
                g2.fill(f64);
                Rectangle b14 = new Rectangle(2530-move,472,3,3);
                g2.fill(b14);
                Rectangle b24 = new Rectangle(2612-move,472,3,3);
                g2.fill(b24);
                g2.setColor(Color.BLACK);

            }

            else if(pattern == 3)
            {
                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r15 = new Rectangle(2180-move,410,65,90);
                g2.fill(r15);
                g2.setColor(Color.BLACK);
                //Random Cactus 1
                Rectangle cBody = new Rectangle(2200-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(2180-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(2180-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(2220-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(2230-move, 435, 15, 40);
                g2.fill(cHandR);

                g2.setColor(bc);
                Rectangle f1 = new Rectangle(2200-move,410,3,3);
                g2.fill(f1);
                Rectangle f2 = new Rectangle(2217-move,410,3,3);
                g2.fill(f2);
                Rectangle f3 = new Rectangle(2180-move,445,3,3);
                g2.fill(f3);
                Rectangle f4 = new Rectangle(2192-move,445,3,3);
                g2.fill(f4);
                Rectangle f5 = new Rectangle(2230-move,435,3,3);
                g2.fill(f5);
                Rectangle f6 = new Rectangle(2242-move,435,3,3);
                g2.fill(f6);
                Rectangle b1 = new Rectangle(2180-move,472,3,3);
                g2.fill(b1);
                Rectangle b2 = new Rectangle(2242-move,472,3,3);
                g2.fill(b2);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 2
                g2.setColor(bc);
                Rectangle r16 = new Rectangle(1780-move,420,105,80);
                g2.fill(r16);
                g2.setColor(Color.BLACK);
                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(1800-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(1780-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(1780-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(1860-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(1870-move, 435, 15, 40);
                g2.fill(cHandR2);

                g2.setColor(bc);
                Rectangle f12 = new Rectangle(1800-move,420,3,3);
                g2.fill(f12);
                Rectangle f22 = new Rectangle(1857-move,420,3,3);
                g2.fill(f22);
                Rectangle f32 = new Rectangle(1780-move,445,3,3);
                g2.fill(f32);
                Rectangle f42 = new Rectangle(1792-move,445,3,3);
                g2.fill(f42);
                Rectangle f52 = new Rectangle(1870-move,435,3,3);
                g2.fill(f52);
                Rectangle f62 = new Rectangle(1882-move,435,3,3);
                g2.fill(f62);
                Rectangle b12 = new Rectangle(1780-move,472,3,3);
                g2.fill(b12);
                Rectangle b22 = new Rectangle(1882-move,472,3,3);
                g2.fill(b22);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 3
                g2.setColor(bc);
                Rectangle r17 = new Rectangle(2530-move,410,75,90);
                g2.fill(r17);
                g2.setColor(Color.BLACK);
                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(2550-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(2530-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(2530-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(2580-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(2590-move, 435, 15, 40);
                g2.fill(cHandR3);

                g2.setColor(bc);
                Rectangle f13 = new Rectangle(2550-move,410,3,3);
                g2.fill(f13);
                Rectangle f23 = new Rectangle(2577-move,410,3,3);
                g2.fill(f23);
                Rectangle f33 = new Rectangle(2530-move,445,3,3);
                g2.fill(f33);
                Rectangle f43 = new Rectangle(2542-move,445,3,3);
                g2.fill(f43);
                Rectangle f53 = new Rectangle(2590-move,435,3,3);
                g2.fill(f53);
                Rectangle f63 = new Rectangle(2602-move,435,3,3);
                g2.fill(f63);
                Rectangle b13 = new Rectangle(2530-move,472,3,3);
                g2.fill(b13);
                Rectangle b23 = new Rectangle(2602-move,472,3,3);
                g2.fill(b23);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 4
                g2.setColor(bc);
                Rectangle r18 = new Rectangle(2880-move,400,85,100);
                g2.fill(r18);
                g2.setColor(Color.BLACK);
                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2900-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2880-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2880-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2940-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2950-move, 435, 15, 40);
                g2.fill(cHandR4);

                g2.setColor(bc);
                Rectangle f14 = new Rectangle(2900-move,400,3,3);
                g2.fill(f14);
                Rectangle f24 = new Rectangle(2937-move,400,3,3);
                g2.fill(f24);
                Rectangle f34 = new Rectangle(2880-move,445,3,3);
                g2.fill(f34);
                Rectangle f44 = new Rectangle(2892-move,445,3,3);
                g2.fill(f44);
                Rectangle f54 = new Rectangle(2950-move,435,3,3);
                g2.fill(f54);
                Rectangle f64 = new Rectangle(2962-move,435,3,3);
                g2.fill(f64);
                Rectangle b14 = new Rectangle(2880-move,472,3,3);
                g2.fill(b14);
                Rectangle b24 = new Rectangle(2962-move,472,3,3);
                g2.fill(b24);
                g2.setColor(Color.BLACK);

            }

            else if(pattern == 4)
            {
                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r19 = new Rectangle(2180-move,410,65,90);
                g2.fill(r19);
                g2.setColor(Color.BLACK);
                //Random Cactus 1
                Rectangle cBody = new Rectangle(2200-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(2180-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(2180-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(2220-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(2230-move, 435, 15, 40);
                g2.fill(cHandR);

                g2.setColor(bc);
                Rectangle f1 = new Rectangle(2200-move,410,3,3);
                g2.fill(f1);
                Rectangle f2 = new Rectangle(2217-move,410,3,3);
                g2.fill(f2);
                Rectangle f3 = new Rectangle(2180-move,445,3,3);
                g2.fill(f3);
                Rectangle f4 = new Rectangle(2192-move,445,3,3);
                g2.fill(f4);
                Rectangle f5 = new Rectangle(2230-move,435,3,3);
                g2.fill(f5);
                Rectangle f6 = new Rectangle(2242-move,435,3,3);
                g2.fill(f6);
                Rectangle b1 = new Rectangle(2180-move,472,3,3);
                g2.fill(b1);
                Rectangle b2 = new Rectangle(2242-move,472,3,3);
                g2.fill(b2);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 2
                g2.setColor(bc);
                Rectangle r20 = new Rectangle(2480-move,420,105,80);
                g2.fill(r20);
                g2.setColor(Color.BLACK);
                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(2500-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(2480-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(2480-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(2560-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(2570-move, 435, 15, 40);
                g2.fill(cHandR2);

                g2.setColor(bc);
                Rectangle f13 = new Rectangle(2500-move,420,3,3);
                g2.fill(f13);
                Rectangle f23 = new Rectangle(2557-move,420,3,3);
                g2.fill(f23);
                Rectangle f33 = new Rectangle(2480-move,445,3,3);
                g2.fill(f33);
                Rectangle f43 = new Rectangle(2492-move,445,3,3);
                g2.fill(f43);
                Rectangle f53 = new Rectangle(2570-move,435,3,3);
                g2.fill(f53);
                Rectangle f63 = new Rectangle(2582-move,435,3,3);
                g2.fill(f63);
                Rectangle b13 = new Rectangle(2480-move,472,3,3);
                g2.fill(b13);
                Rectangle b23 = new Rectangle(2582-move,472,3,3);
                g2.fill(b23);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 3
                g2.setColor(bc);
                Rectangle r21 = new Rectangle(1830-move,410,75,90);
                g2.fill(r21);
                g2.setColor(Color.BLACK);
                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(1850-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(1830-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(1830-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(1880-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(1890-move, 435, 15, 40);
                g2.fill(cHandR3);

                g2.setColor(bc);
                Rectangle f12 = new Rectangle(1850-move,410,3,3);
                g2.fill(f12);
                Rectangle f22 = new Rectangle(1877-move,410,3,3);
                g2.fill(f22);
                Rectangle f32 = new Rectangle(1830-move,445,3,3);
                g2.fill(f32);
                Rectangle f42 = new Rectangle(1842-move,445,3,3);
                g2.fill(f42);
                Rectangle f52 = new Rectangle(1890-move,435,3,3);
                g2.fill(f52);
                Rectangle f62 = new Rectangle(1902-move,435,3,3);
                g2.fill(f62);
                Rectangle b12 = new Rectangle(1830-move,472,3,3);
                g2.fill(b12);
                Rectangle b22 = new Rectangle(1902-move,472,3,3);
                g2.fill(b22);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 4
                g2.setColor(bc);
                Rectangle r22 = new Rectangle(2880-move,400,85,100);
                g2.fill(r22);
                g2.setColor(Color.BLACK);
                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2900-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2880-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2880-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2940-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2950-move, 435, 15, 40);
                g2.fill(cHandR4);

                g2.setColor(bc);
                Rectangle f14 = new Rectangle(2900-move,400,3,3);
                g2.fill(f14);
                Rectangle f24 = new Rectangle(2937-move,400,3,3);
                g2.fill(f24);
                Rectangle f34 = new Rectangle(2880-move,445,3,3);
                g2.fill(f34);
                Rectangle f44 = new Rectangle(2892-move,445,3,3);
                g2.fill(f44);
                Rectangle f54 = new Rectangle(2950-move,435,3,3);
                g2.fill(f54);
                Rectangle f64 = new Rectangle(2962-move,435,3,3);
                g2.fill(f64);
                Rectangle b14 = new Rectangle(2880-move,472,3,3);
                g2.fill(b14);
                Rectangle b24 = new Rectangle(2962-move,472,3,3);
                g2.fill(b24);
                g2.setColor(Color.BLACK);

            }

            else if(pattern == 5)
            {
                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r23 = new Rectangle(2480-move,410,65,90);
                g2.fill(r23);
                g2.setColor(Color.BLACK);
                //Random Cactus 1
                Rectangle cBody = new Rectangle(2500-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(2480-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(2480-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(2520-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(2530-move, 435, 15, 40);
                g2.fill(cHandR);

                g2.setColor(bc);
                Rectangle f13 = new Rectangle(2500-move,410,3,3);
                g2.fill(f13);
                Rectangle f23 = new Rectangle(2517-move,410,3,3);
                g2.fill(f23);
                Rectangle f33 = new Rectangle(2480-move,445,3,3);
                g2.fill(f33);
                Rectangle f43 = new Rectangle(2492-move,445,3,3);
                g2.fill(f43);
                Rectangle f53 = new Rectangle(2530-move,435,3,3);
                g2.fill(f53);
                Rectangle f63 = new Rectangle(2542-move,435,3,3);
                g2.fill(f63);
                Rectangle b13 = new Rectangle(2480-move,472,3,3);
                g2.fill(b13);
                Rectangle b23 = new Rectangle(2542-move,472,3,3);
                g2.fill(b23);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 1
                g2.setColor(bc);
                Rectangle r24 = new Rectangle(2180-move,420,105,80);
                g2.fill(r24);
                g2.setColor(Color.BLACK);
                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(2200-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(2180-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(2180-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(2260-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(2270-move, 435, 15, 40);
                g2.fill(cHandR2);

                g2.setColor(bc);
                Rectangle f1 = new Rectangle(2200-move,420,3,3);
                g2.fill(f1);
                Rectangle f2 = new Rectangle(2257-move,420,3,3);
                g2.fill(f2);
                Rectangle f3 = new Rectangle(2180-move,445,3,3);
                g2.fill(f3);
                Rectangle f4 = new Rectangle(2192-move,445,3,3);
                g2.fill(f4);
                Rectangle f5 = new Rectangle(2270-move,435,3,3);
                g2.fill(f5);
                Rectangle f6 = new Rectangle(2282-move,435,3,3);
                g2.fill(f6);
                Rectangle b1 = new Rectangle(2180-move,472,3,3);
                g2.fill(b1);
                Rectangle b2 = new Rectangle(2282-move,472,3,3);
                g2.fill(b2);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 3
                g2.setColor(bc);
                Rectangle r25 = new Rectangle(1830-move,410,75,90);
                g2.fill(r25);
                g2.setColor(Color.BLACK);
                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(1850-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(1830-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(1830-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(1880-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(1890-move, 435, 15, 40);
                g2.fill(cHandR3);

                g2.setColor(bc);
                Rectangle f12 = new Rectangle(1850-move,410,3,3);
                g2.fill(f12);
                Rectangle f22 = new Rectangle(1877-move,410,3,3);
                g2.fill(f22);
                Rectangle f32 = new Rectangle(1830-move,445,3,3);
                g2.fill(f32);
                Rectangle f42 = new Rectangle(1842-move,445,3,3);
                g2.fill(f42);
                Rectangle f52 = new Rectangle(1890-move,435,3,3);
                g2.fill(f52);
                Rectangle f62 = new Rectangle(1902-move,435,3,3);
                g2.fill(f62);
                Rectangle b12 = new Rectangle(1830-move,472,3,3);
                g2.fill(b12);
                Rectangle b22 = new Rectangle(1902-move,472,3,3);
                g2.fill(b22);
                g2.setColor(Color.BLACK);

                //Rectangle behind Cactus 4
                g2.setColor(bc);
                Rectangle r26 = new Rectangle(2880-move,400,85,100);
                g2.fill(r26);
                g2.setColor(Color.BLACK);
                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2900-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2880-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2880-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2940-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2950-move, 435, 15, 40);
                g2.fill(cHandR4);

                g2.setColor(bc);
                Rectangle f14 = new Rectangle(2900-move,400,3,3);
                g2.fill(f14);
                Rectangle f24 = new Rectangle(2937-move,400,3,3);
                g2.fill(f24);
                Rectangle f34 = new Rectangle(2880-move,445,3,3);
                g2.fill(f34);
                Rectangle f44 = new Rectangle(2892-move,445,3,3);
                g2.fill(f44);
                Rectangle f54 = new Rectangle(2950-move,435,3,3);
                g2.fill(f54);
                Rectangle f64 = new Rectangle(2962-move,435,3,3);
                g2.fill(f64);
                Rectangle b14 = new Rectangle(2880-move,472,3,3);
                g2.fill(b14);
                Rectangle b24 = new Rectangle(2962-move,472,3,3);
                g2.fill(b24);
                g2.setColor(Color.BLACK);

            }


            else
            {
                //Random Cactus 1
                Rectangle cBody = new Rectangle(2500-move, 410, 20, 90);
                g2.fill(cBody);

                Rectangle cArmL = new Rectangle(2480-move, 460, 20, 15);
                g2.fill(cArmL);

                Rectangle cHandL = new Rectangle(2480-move, 445, 15, 30);
                g2.fill(cHandL);

                Rectangle cArmR = new Rectangle(2520-move, 460, 20, 15);
                g2.fill(cArmR);

                Rectangle cHandR = new Rectangle(2530-move, 435, 15, 40);
                g2.fill(cHandR);

                //Random Cactus 2
                Rectangle cBody2 = new Rectangle(2200-move, 420, 60, 80);
                g2.fill(cBody2);

                Rectangle cArmL2 = new Rectangle(2180-move, 460, 20, 15);
                g2.fill(cArmL2);

                Rectangle cHandL2 = new Rectangle(2180-move, 445, 15, 30);
                g2.fill(cHandL2);

                Rectangle cArmR2 = new Rectangle(2260-move, 460, 20, 15);
                g2.fill(cArmR2);

                Rectangle cHandR2 = new Rectangle(2270-move, 435, 15, 40);
                g2.fill(cHandR2);

                //Random Cactus 3
                Rectangle cBody3 = new Rectangle(1850-move, 410, 30, 90);
                g2.fill(cBody3);

                Rectangle cArmL3 = new Rectangle(1830-move, 460, 20, 15);
                g2.fill(cArmL3);

                Rectangle cHandL3 = new Rectangle(1830-move, 445, 15, 30);
                g2.fill(cHandL3);

                Rectangle cArmR3 = new Rectangle(1880-move, 460, 20, 15);
                g2.fill(cArmR3);

                Rectangle cHandR3 = new Rectangle(1890-move, 435, 15, 40);
                g2.fill(cHandR3);

                //Random Cactus 4
                Rectangle cBody4 = new Rectangle(2900-move, 400, 40, 100);
                g2.fill(cBody4);

                Rectangle cArmL4 = new Rectangle(2880-move, 460, 20, 15);
                g2.fill(cArmL4);

                Rectangle cHandL4 = new Rectangle(2880-move, 445, 15, 30);
                g2.fill(cHandL4);

                Rectangle cArmR4 = new Rectangle(2940-move, 460, 20, 15);
                g2.fill(cArmR4);

                Rectangle cHandR4 = new Rectangle(2950-move, 435, 15, 40);
                g2.fill(cHandR4);
            }

            //Rectangle behind Dino
            g2.setColor(bc);

            Rectangle r1 = new Rectangle(50,411-move1,90,89);
            //r1.setRect(50,411-move1,90,89);
            g2.fill(r1);

            //Now onto Dinosaur
            g2.setColor(Color.BLACK);

            Rectangle head1 = new Rectangle(100,411-move1,35,25);
            g2.draw(head1);
            g2.fill(head1);

            Rectangle head2 = new Rectangle(95,416-move1,5,20);
            g2.draw(head2);
            g2.fill(head2);

            Rectangle head3 = new Rectangle(135,416-move1,5,20);
            g2.draw(head3);
            g2.fill(head3);

            Rectangle mouth1 = new Rectangle(95,436-move1,20,5);
            g2.draw(mouth1);
            g2.fill(mouth1);

            Rectangle mouth2 = new Rectangle(95,441-move1,35,5);
            g2.draw(mouth2);
            g2.fill(mouth2);

            Rectangle body1 = new Rectangle(90,446-move1,20,25);
            g2.draw(body1);
            g2.fill(body1);

            Rectangle body2 = new Rectangle(84,451-move1,20,26);
            g2.draw(body2);
            g2.fill(body2);

            Rectangle body3 = new Rectangle(79,456-move1,20,30);
            g2.draw(body3);
            g2.fill(body3);

            Rectangle body4 = new Rectangle(74,461-move1,5,25);
            g2.draw(body4);
            g2.fill(body4);

            Rectangle tail1 = new Rectangle(70,466-move1,5,20);
            g2.draw(tail1);
            g2.fill(tail1);

            Rectangle tail2 = new Rectangle(65,466-move1,5,15);
            g2.draw(tail2);
            g2.fill(tail2);

            Rectangle tail3 = new Rectangle(60,461-move1,5,15);
            g2.draw(tail3);
            g2.fill(tail3);

            Rectangle tail4 = new Rectangle(55,456-move1,5,15);
            g2.draw(tail4);
            g2.fill(tail4);

            Rectangle tail5 = new Rectangle(50,446-move1,5,22);
            g2.draw(tail5);
            g2.fill(tail5);

            Rectangle leftLeg1 = new Rectangle(74,486-move1,9,7);
            g2.draw(leftLeg1);
            g2.fill(leftLeg1);

            Rectangle leftLeg2 = new Rectangle(74,493-move1,5,7);
            g2.draw(leftLeg2);
            g2.fill(leftLeg2);

            Rectangle leftFoot1 = new Rectangle(74,497-move1,9,3);//
            g2.draw(leftFoot1);
            g2.fill(leftFoot1);

            Rectangle leftThigh1 = new Rectangle(83,483-move1,4,7);
            g2.draw(leftThigh1);
            g2.fill(leftThigh1);

            Rectangle rightThigh1 = new Rectangle(92,486-move1,7,4);
            g2.draw(rightThigh1);
            g2.fill(rightThigh1);

            Rectangle rightLeg1 = new Rectangle(94,490-move1,5,10);
            g2.draw(rightLeg1);
            g2.fill(rightLeg1);

            Rectangle rightFoot1 = new Rectangle(94,497-move1,9,3);
            g2.draw(rightFoot1);
            g2.fill(rightFoot1);

            Rectangle arm1 = new Rectangle(110,456-move1,10,4);
            g2.draw(arm1);
            g2.fill(arm1);

            Rectangle arm2 = new Rectangle(116,460-move1,4,4);
            g2.draw(arm2);
            g2.fill(arm2);

            g2.setColor(Color.WHITE); //Color Change to white

            Rectangle eye = new Rectangle(105,417-move1,3,3);
            g2.draw(eye);
            g2.fill(eye);

            //Rectangle behind first blimp
            g2.setColor(bc);
            Rectangle meteorB = new Rectangle(2000-move,285,110,35);
            g2.fill(meteorB);
            g2.setColor(Color.BLACK);

            //Blimp   1
            //tip
            Rectangle blimp1 = new Rectangle(2000-move,295,5,15);
            //g2.setColor(Color.RED);
            g2.fill (blimp1);
            //second tip
            Rectangle blimp2 = new Rectangle(2005-move,290,10,25);
            //g2.setColor(Color.GREEN);
            g2.fill (blimp2);
            //body
            Rectangle blimp3 = new Rectangle(2015-move,285,75,35);
            //g2.setColor(Color.BLUE);
            g2.fill (blimp3);
            //words
            Rectangle h1 = new Rectangle(2030-move,290,5,25);
            //g2.setColor(word);
            g2.fill (h1);

            Rectangle blimp3a = new Rectangle(2085-move,290,5,25);
            g2.setColor(Color.BLACK);
            g2.fill (blimp3a);
            Rectangle blimp4 = new Rectangle(2090-move,295,5,15);
            g2.fill (blimp4);
            Rectangle blimp5 = new Rectangle(2095-move,285,5,35);
            g2.fill (blimp5);
            Rectangle blimp6 = new Rectangle(2100-move,285,5,10);
            g2.fill (blimp6);
            Rectangle blimp7 = new Rectangle(2100-move,310,5,10);
            g2.fill (blimp7);
            Rectangle blimp8 = new Rectangle(2105-move,285,5,5);
            g2.fill (blimp8);
            Rectangle blimp9 = new Rectangle(2105-move,315,5,5);
            g2.fill (blimp9);
            Rectangle blimp10 = new Rectangle(2100-move,300,10,5);
            g2.fill (blimp10);

            //Rectangle behind second blimp
            g2.setColor(bc);
            Rectangle meteorB1 = new Rectangle(2350-move,285,110,35);
            g2.fill(meteorB1);
            g2.setColor(Color.BLACK);

            //Blimp   1
            Rectangle blimp11 = new Rectangle(2350-move,295,5,15);
            g2.fill (blimp11);
            Rectangle blimp21 = new Rectangle(2355-move,290,10,25);
            g2.fill (blimp21);
            Rectangle blimp31 = new Rectangle(2365-move,285,75,35);
            g2.fill (blimp31);
            Rectangle blimp3a1 = new Rectangle(2435-move,290,5,25);
            g2.fill (blimp3a1);
            Rectangle blimp41 = new Rectangle(2440-move,295,5,15);
            g2.fill (blimp41);
            Rectangle blimp51 = new Rectangle(2445-move,285,5,35);
            g2.fill (blimp51);
            Rectangle blimp61 = new Rectangle(2450-move,285,5,10);
            g2.fill (blimp61);
            Rectangle blimp71 = new Rectangle(2450-move,310,5,10);
            g2.fill (blimp71);
            Rectangle blimp81 = new Rectangle(2455-move,285,5,5);
            g2.fill (blimp81);
            Rectangle blimp91 = new Rectangle(2455-move,315,5,5);
            g2.fill (blimp91);
            Rectangle blimp93 = new Rectangle(2450-move,300,10,5);
            g2.fill (blimp93);

            //Rectangle behind third blimp
            g2.setColor(bc);
            Rectangle meteorB2 = new Rectangle(2750-move,285,110,35);
            g2.fill(meteorB2);
            g2.setColor(Color.BLACK);

            //Blimp   1
            Rectangle blimp12 = new Rectangle(2750-move,295,5,15);
            g2.fill (blimp12);
            Rectangle blimp22 = new Rectangle(2755-move,290,10,25);
            g2.fill (blimp22);
            Rectangle blimp32 = new Rectangle(2765-move,285,75,35);
            g2.fill (blimp32);
            Rectangle blimp3a2 = new Rectangle(2835-move,290,5,25);
            g2.fill (blimp3a2);
            Rectangle blimp42 = new Rectangle(2840-move,295,5,15);
            g2.fill (blimp42);
            Rectangle blimp52 = new Rectangle(2845-move,285,5,35);
            g2.fill (blimp52);
            Rectangle blimp62 = new Rectangle(2850-move,285,5,10);
            g2.fill (blimp62);
            Rectangle blimp72 = new Rectangle(2850-move,310,5,10);
            g2.fill (blimp72);
            Rectangle blimp82 = new Rectangle(2855-move,285,5,5);
            g2.fill (blimp82);
            Rectangle blimp92 = new Rectangle(2855-move,315,5,5);
            g2.fill (blimp92);
            Rectangle blimp94 = new Rectangle(2850-move,300,10,5);
            g2.fill (blimp94);

        }
    }


