package com.fate.test;

import com.fate.test.t.dress;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;

//java图像模版匹配
//核心思路：用一张小图片，在一张大图片里去寻找，并返回该小图片所在的坐标位置，然后将鼠标移向该处，并实施相应操作。并更据页面的反馈，进行相应的判断（断言）
//1.对需要操作的对象进行截图，得到一张小图片，并保存。
//2.对当前屏幕进行截图，获得一张大图片，保存或放在内存中
//3.利用模版匹配，在大图片中，按像素对小图片进行滑动，找到小图片所在的位置。
//4.对该坐标位置(X,Y),加上小图片高度的一半(H)，宽度的一般(W)，得到该小图片的中心位置，即是我们要操作的坐标(X+W,Y+H)
//5。将鼠标移向该坐标(X,Y),并进行相应操作(输入,单机,双击,右键等).
//6.继续第二轮操作，第三轮操作。直到第N轮。最后进行模版匹配，来确认是否存在和预期结果一致的小图片，进而实现断言。
//由于是基于的像素匹配，所以，如果界面风格发生变化，可能出现识别不到的情况。
//陈sir c呆 c呆 海妈 懿抹多 豆爸 换人服
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
        int t=1;
        while(true) {
            int i = 1;
            System.out.println("正在冲浪第"+t+"次周回,Kira⭐~");
            while (i <= 15) {
                Thread.sleep(2000);
                String imageDir = System.getProperty("user.dir") + "/wincalc/";
                //System.out.println(imageDir);
                int[] target = im.findImages(imageDir + i + ".png");
                //System.out.println("找到一个点：" + target[0] + " : " + target[1]);
                if (target[0] == -1) {
                    if (i == 15) {
                        while (true) {
                            int[] target1 = im.findImages(imageDir + "flush" + ".png");
                            if (target1[0] != -1) {
                                Robot robot = new Robot();
                                robot.mouseMove(target1[0], target1[1]);
                                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                Thread.sleep(2000);
                                int[] target2 = im.findImages(imageDir + "flush1" + ".png");
                                if (target2[0] != -1) {
                                    robot.mouseMove(target2[0], target2[1]);
                                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
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
                        robot.mouseMove(target[0] - 80, target[1] + 140);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0], target[1] + 140);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        //选择技能对象
                        robot.mouseMove(target[0] + 400, target[1]-100);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.mouseMove(target[0] + 80, target[1] + 140);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        robot.mouseMove(target[0] + 400, target[1]-100);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    } else if (i == 1) {
                        Thread.sleep(1000);
                        Robot robot = new Robot();
                        robot.mouseMove(target[0]-850, target[1]+400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0] -810, target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        //选择技能对象
                        robot.mouseMove(target[0] - 200, target[1]+300);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.mouseMove(target[0] -720, target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);

                        robot.mouseMove(target[0] - 200, target[1]+300);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);

                        robot.mouseMove(target[0]-650, target[1]+400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0] -570, target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        //选择技能对象
                        robot.mouseMove(target[0] - 200, target[1]+300);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        //指向性技能
                        robot.mouseMove(target[0] -500, target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        //选择技能对象
                        robot.mouseMove(target[0] - 200, target[1]+300);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);

                        robot.mouseMove(target[0], target[1]+180);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        robot.mouseMove(target[0]-60, target[1]+180);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        robot.mouseMove(target[0]-60, target[1]+180);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        robot.mouseMove(target[0]-850, target[1]+180);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);
                        robot.mouseMove(target[0]-425, target[1]+450);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(4000);

                        robot.mouseMove(target[0] -810, target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.mouseMove(target[0] -720, target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(500);

                        robot.mouseMove(target[0] - 200, target[1]+300);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);

                        i=4;
                    } else if (i == 3) {
                        //Robot robot = new Robot();
                        //robot.mouseMove(target[0] - 80, target[1] + 140);
                        //robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        //robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        //Thread.sleep(2000);
                        //指向性技能
                        //robot.mouseMove(target[0], target[1] + 140);
                        //robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        //robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        //Thread.sleep(2000);
                        //robot.mouseMove(target[0] + 80, target[1] + 140);
                        //robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        //robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);

                        i++;
                    } else if (i == 4 || i == 6 || i == 8) {
                        Robot robot = new Robot();
                        Thread.sleep(1000);
                        if(i==6){
                            robot.mouseMove(target[0]-850, target[1]+400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(3000);
                            robot.mouseMove(target[0] -720, target[1] + 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(3000);
                            robot.mouseMove(target[0] -320, target[1] + 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(3000);

                        }else if(i==8){
                            robot.mouseMove(target[0]-850, target[1]+400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(3000);
                            //指向性技能
                            robot.mouseMove(target[0] -810, target[1] + 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(500);
                            //选择技能对象
                            robot.mouseMove(target[0] - 200, target[1]+300);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(3000);
                            robot.mouseMove(target[0] -720, target[1] + 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(500);

                            robot.mouseMove(target[0] - 200, target[1]+300);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(3000);
                        }
                        robot.mouseMove(target[0], target[1] + 400);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    } else if (i == 5 || i == 7 || i == 9) {
                        Robot robot = new Robot();
                        if(i==9){
                            robot.mouseMove(target[0] - 650, target[1] - 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(1000);
                            robot.mouseMove(target[0] - 450, target[1] - 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(1000);
                            robot.mouseMove(target[0] - 250, target[1] - 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        }else {
                            robot.mouseMove(target[0] - 250, target[1] - 400);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(1000);
                            robot.mouseMove(target[0] - 250, target[1] - 200);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            Thread.sleep(1000);
                            robot.mouseMove(target[0] - 50, target[1] - 200);
                            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        }
                        i++;
                    }else if (i==10){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        //int[] target3 = im.findImages(imageDir + "test" + ".png");
                        //if(target3[0]==-1){
                         //   i++;
                        //} else{
                        //    robot.mouseMove(target3[0], target3[1]);
                        //    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        //    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                            i++;
                        //}

                    }else if (i==14){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        int[] target4 = im.findImages(imageDir + "sucess" + ".png");
                        if(target4[0]==-1){

                        }else{
                            robot.mouseMove(target4[0], target4[1]);
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
                System.out.println("当前步骤数:" + i);
            }
            t++;
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

        for (int y=0; y<bigHeight-smallHeight; y++) {
            for (int x=0; x<bigWidth-smallWidth; x++) {
                // 对关键点进行先期匹配，降低运算复杂度。如果关键点本身就不匹配，就没必要再去匹配小图的每一个像素点。
                if (bigData[x][y] == smallData[0][0] ||   // 左上角
                        bigData[x+smallWidth-1][y] == smallData[smallWidth-1][0] ||  // 右上角
                        bigData[x][y+smallHeight-1] == smallData[0][smallHeight-1] || // 左下角
                        bigData[x+smallWidth-1][y+smallHeight-1] == smallData[smallWidth-1][smallHeight-1] || // 右下角
                        bigData[x+smallWidth/2][y+smallHeight/2] == smallData[smallWidth/2][smallHeight/2]
                ) {
                    // 进行全像素匹配
                    boolean isMatched = this.checkAllMatch(x, y, smallHeight, smallWidth, bigData, smallData);
                    if (isMatched) {
                        System.out.println("像素点X" + x + " : Y" + y + "，对应的值为：" + bigData[x][y]);
                        // 获取小图的中心位置的点
                        int centerX = x + smallWidth/2;
                        int centerY = y + smallHeight/2;
                        target[0] = centerX;
                        target[1] = centerY;
                        return target;
                    }
                }
            }
        }

        return target;
    }

    // 全像素匹配
    public boolean checkAllMatch(int x, int y, int smallHeight, int smallWidth, int[][] bigData, int[][] smallData) {
        boolean isMatched = true;
        for (int smallY=0; smallY<smallHeight; smallY++) {
            for (int smallX=0; smallX<smallWidth; smallX++) {
                // 如果发现有一个像素点，两者的值不一样，则认为不相等，如果不相等，则没必要继续比较其它点.
                if (bigData[x+smallX][y+smallY] != smallData[smallX][smallY]) {
                    isMatched = false;
                    return isMatched;
                }
            }
        }
        return isMatched;
    }

    public int checkAllMatchs(int x, int y, int smallHeight, int smallWidth, int[][] bigData, int[][] smallData) {
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

    public int[] findImages(String imagePath) {
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
                if(max.getMax()>=50){

                    break;
                }
                // 对关键点进行先期匹配，降低运算复杂度。如果关键点本身就不匹配，就没必要再去匹配小图的每一个像素点。

                if (
                        bigData[x][y] == smallData[0][0] ||   // 左上角
                        bigData[x+smallWidth-1][y] == smallData[smallWidth-1][0] ||  // 右上角
                        bigData[x][y+smallHeight-1] == smallData[0][smallHeight-1] || // 左下角
                        bigData[x+smallWidth-1][y+smallHeight-1] == smallData[smallWidth-1][smallHeight-1] || // 右下角
                        bigData[x+smallWidth/2][y+smallHeight/2] == smallData[smallWidth/2][smallHeight/2] ||
                        this.test(bigImage,smallImage,x,y,0,0) ||   // 左上角
                        this.test(bigImage,smallImage,x+smallWidth-1,y , smallWidth-1,0) ||  // 右上角
                        this.test(bigImage,smallImage,x,y+smallHeight-1, 0,smallHeight-1) || // 左下角
                        this.test(bigImage,smallImage,x+smallWidth-1,y+smallHeight-1 , smallWidth-1,smallHeight-1) || // 右下角
                        this.test(bigImage,smallImage,x+smallWidth/2,y+smallHeight/2,smallWidth/2,smallHeight/2)
                ) {
                    // 进行全像素匹配
                    int isMatched = this.checkAllMatchs(x, y, smallHeight, smallWidth, bigData, smallData);
                    //System.out.println("???????:   "+x+"     !!!!!!!!!!!!!!!:   "+y);
                    if(max.getMax()<isMatched){

                        max.setMax(isMatched);
                        max.setX(x);
                        max.setY(y);
                        if(max.getMax()>=50){
                            break;
                        }
                    }

                }
            }

        }
        if (max.getMax()>=50) {
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
    public boolean test(BufferedImage bigImage,BufferedImage smallImage,int x,int y,int x1,int y1){


        int r = (bigImage.getRGB(x, y) & 0xFF0000) >> 16;
        int g = (bigImage.getRGB(x, y) & 0xFF00) >> 8;
        int b = bigImage.getRGB(x, y) & 0xFF;
        int r1 = (smallImage.getRGB(x1, y1) & 0xFF0000) >> 16;
        int g1 = (smallImage.getRGB(x1, y1) & 0xFF00) >> 8;
        int b1 = smallImage.getRGB(x1, y1) & 0xFF;
        int error = Math.abs(r1-r)+Math.abs(g1-g)+Math.abs(b1-b);

        if (error>10){
            return false;
        }else {
            //System.out.println(error);
            return true;
        }
    }

}