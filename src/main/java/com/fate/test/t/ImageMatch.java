package com.fate.test.t;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;

import javax.imageio.ImageIO;
//java图像模版匹配
//核心思路：用一张小图片，在一张大图片里去寻找，并返回该小图片所在的坐标位置，然后将鼠标移向该处，并实施相应操作。并更据页面的反馈，进行相应的判断（断言）
//1.对需要操作的对象进行截图，得到一张小图片，并保存。
//2.对当前屏幕进行截图，获得一张大图片，保存或放在内存中
//3.利用模版匹配，在大图片中，按像素对小图片进行滑动，找到小图片所在的位置。
//4.对该坐标位置(X,Y),加上小图片高度的一半(H)，宽度的一般(W)，得到该小图片的中心位置，即是我们要操作的坐标(X+W,Y+H)
//5。将鼠标移向该坐标(X,Y),并进行相应操作(输入,单机,双击,右键等).
//6.继续第二轮操作，第三轮操作。直到第N轮。最后进行模版匹配，来确认是否存在和预期结果一致的小图片，进而实现断言。
//由于是基于的像素匹配，所以，如果界面风格发生变化，可能出现识别不到的情况。
public class ImageMatch {

    public static void main(String[] args) throws Exception {
        ImageMatch im = new ImageMatch();
//      BufferedImage bi = im.getScreenShot();
//      int[][] result = im.getImageRGB(bi);
//      for (int y = 0; y < result.length; y++) {
//          for (int x = 0; x < result[y].length; x++) {
//              System.out.println(result[y][x]);
//          }
//      }
        //Runtime.getRuntime().exec("C:/Windows/system32/calc.exe");
        while(true) {
            int i = 1;
            while (i <= 15) {

                String imageDir = System.getProperty("user.dir") + "/wincalc/";
                System.out.println(imageDir);
                int[] target = im.findImage(imageDir + i + ".png");
                System.out.println("找到一个点：" + target[0] + " : " + target[1]);
                if (target[0] == -1) {
                    if (i == 15) {
                        while (true) {
                            int[] target1 = im.findImage(imageDir + "flush" + ".png");
                            if (target1[0] != -1) {
                                Robot robot = new Robot();
                                robot.mouseMove(target1[0], target1[1]);
                                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                Thread.sleep(2000);
                                int[] target2 = im.findImage(imageDir + "flush1" + ".png");
                                if (target2[0] != -1) {
                                    robot.mouseMove(target2[0]-60, target2[1]+110);
                                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                    //Thread.sleep(7000);
                                    break;
                                }
                            }
                        }
                    }else if (i==14){
                        System.out.println(i);
                        i++;
                    }
                } else {
                    if (i == 2) {
                        Robot robot = new Robot();
                        robot.mouseMove(target[0] - 30, target[1] + 30);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0], target[1] + 30);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        //选择技能对象
                        robot.mouseMove(target[0] + 110, target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.mouseMove(target[0] + 15, target[1] + 30);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        robot.mouseMove(target[0] + 100, target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    } else if (i == 1) {
                        Robot robot = new Robot();
                        robot.mouseMove(target[0] - 275, target[1]+120);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0] -255, target[1] + 120);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        //选择技能对象
                        robot.mouseMove(target[0] - 50, target[1]+90);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.mouseMove(target[0] -235, target[1] + 120);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);

                        robot.mouseMove(target[0] - 50, target[1]+90);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    } else if (i == 3) {
                        Robot robot = new Robot();
                        robot.mouseMove(target[0] - 20, target[1] + 30);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0], target[1] + 30);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.mouseMove(target[0] + 20, target[1] + 30);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);

                        i++;
                    } else if (i == 4 || i == 6 || i == 8) {
                        Robot robot = new Robot();
                        robot.mouseMove(target[0] - 20, target[1] + 120);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    } else if (i == 5 || i == 7 || i == 9) {
                        Robot robot = new Robot();
                        robot.mouseMove(target[0] - 80, target[1] - 120);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        robot.mouseMove(target[0] - 80, target[1] - 40);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        robot.mouseMove(target[0] - 5, target[1] - 40);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    } else if (i==12){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]+150);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    }else if (i==10){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        int[] target3 = im.findImage(imageDir + "test" + ".png");
                        if(target3[0]==-1){
                            i++;
                        } else{
                            robot.mouseMove(target3[0], target3[1]);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            i++;
                        }

                    }else if (i==14){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        int[] target4 = im.findImage(imageDir + "sucess" + ".png");
                        if(target4[0]==-1){

                        }else{
                            robot.mouseMove(target4[0]+40, target4[1]+120);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            i++;
                        }

                    }
                    else{
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    }
                }
                System.out.println("i:" + i);
            }
        }

            }

            // 截图
            public BufferedImage getScreenShot() {
                BufferedImage bfImage = null;
                int captureWidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
                int captureHeight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
                try {
                    Robot robot = new Robot();
                    Rectangle screenRect = new Rectangle(0,0,captureWidth,captureHeight);
                    bfImage = robot.createScreenCapture(screenRect);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
                return bfImage;
            }

            // 获取像素点值
            public int[][] getImageRGB(BufferedImage bfImage) {
                int width = bfImage.getWidth();
                int height = bfImage.getHeight();
                int[][] result = new int[width][height];
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {
                // 对某个像素点的RGB编码并存入数据库
                result[x][y] = bfImage.getRGB(x, y) & 0xFFFFFF;
                //单独获取每一个像素点的Red，Green，和Blue的值。
                //int r = (bfImage.getRGB(x, y) & 0xFF0000) >> 16;
                //int g = (bfImage.getRGB(x, y) & 0xFF00) >> 8;
                //int b = bfImage.getRGB(x, y) & 0xFF;
            }
        }
        return result;
    }

    // 进行模板匹配
    public int[] findImage(String imagePath) {
        BufferedImage bigImage = this.getScreenShot();  // 当前屏幕截图
        BufferedImage smallImage = null;        // 打开预选保存的小图片
        try {
            smallImage = ImageIO.read(new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int bigWidth = bigImage.getWidth();
        int bigHeight = bigImage.getHeight();

        int smallWidth = smallImage.getWidth();
        int smallHeight = smallImage.getHeight();

        int[][] bigData = this.getImageRGB(bigImage);
        int[][] smallData = this.getImageRGB(smallImage);

        int[] target = {-1, -1};
        dress max = new dress();
        for (int y=0; y<bigHeight-smallHeight; y++) {
            for (int x=0; x<bigWidth-smallWidth; x++) {
                // 对关键点进行先期匹配，降低运算复杂度。如果关键点本身就不匹配，就没必要再去匹配小图的每一个像素点。
                if (true
                ) {
                    // 进行全像素匹配
                    int isMatched = this.checkAllMatch(x, y, smallHeight, smallWidth, bigData, smallData);
                    //System.out.println("???????:   "+x+"     !!!!!!!!!!!!!!!:   "+y);
                    if(max.getMax()<isMatched){
                        max.setMax(isMatched);
                        max.setX(x);
                        max.setY(y);
                    }

                }
            }
        }
        if (max.getMax()>=11) {
            System.out.println("像素点X" + max.getX() + " : Y" + max.getY() + "，对应的值为：" + bigData[max.getX()][max.getY()]);
            // 获取小图的中心位置的点
            System.out.println((smallHeight*smallWidth));
            System.out.println(max.getMax());
            int centerX = max.getX() + smallWidth/2;
            int centerY = max.getY() + smallHeight/2;
            target[0] = centerX;
            target[1] = centerY;
            return target;
        }

        return target;
    }

    // 全像素匹配
    public int checkAllMatch(int x, int y, int smallHeight, int smallWidth, int[][] bigData, int[][] smallData) {
        boolean isMatched = true;
        int i =0;
        for (int smallY=0; smallY<smallHeight; smallY++) {
            for (int smallX=0; smallX<smallWidth; smallX++) {
                // 如果发现有一个像素点，两者的值不一样，则认为不相等，如果不相等，则没必要继续比较其它点.
                if (bigData[x+smallX][y+smallY] != smallData[smallX][smallY]) {
                    isMatched = false;
                    i++;
                    //return isMatched;
                }
            }
        }
            //System.out.println("错误数"+i);

            int from = ((smallHeight*smallWidth)-i);
            int to = (smallHeight*smallWidth);
            DecimalFormat df = new DecimalFormat("0.00");
            String ppl = df.format(((float) from / to) * 100);
            int ppls = (int) Float.parseFloat(ppl);
            if(ppls>10) {

                System.out.println("匹配率：" + ppl);
                //System.out.println("匹配数：" + ((smallHeight * smallWidth) - i));
            }

        return ppls;
    }
}