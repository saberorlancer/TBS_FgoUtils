package com.fate.test.kkk;

import com.fate.test.power.servlet;
import com.fate.test.power.tang;
import com.fate.test.power.ttk;
import com.fate.test.t.dress;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;

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
            int i = 4;
            System.out.println("正在冲浪第"+t+"次周回,Kira⭐~");
            while (i <= 15) {
                Thread.sleep(2000);
                String imageDir = "D:/test/";
                //System.out.println(imageDir);
                int[] target = im.findImages(imageDir + i + ".png",i);
                //System.out.println("找到一个点：" + target[0] + " : " + target[1]);
                if (target[0] == -1) {
                    if (i == 15) {
                        while (true) {
                            int[] target1 = im.findImages(imageDir + "flush" + ".png",i);
                            if (target1[0] != -1) {
                                Robot robot = new Robot();
                                robot.mouseMove(target1[0], target1[1]);
                                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                Thread.sleep(2000);
                                int[] target2 = im.findImages(imageDir + "flush1" + ".png",i);
                                if (target2[0] != -1) {
                                    robot.mouseMove(target2[0], target2[1]);
                                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                    Thread.sleep(4000);
                                    break;
                                }
                            }
                        }
                    }else if (i==14){
                        System.out.println(i);
                        i++;
                    }
                } else {
                    if(i==1){
                        startTang(null,target[0],target[1]);
                        i++;
                    }else{
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    }
                        //Robot robot = new Robot();
                        //robot.mouseMove(target[0], target[1]);
                        //robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        //robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                }
                System.out.println("当前步骤数:" + i);
            }
            t++;
        }

            }



    public void startbattle(ttk ttkyzmttk) throws InterruptedException, AWTException {
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
            while (i <= 10) {
                Thread.sleep(2000);
                String imageDir = "D:/test/";
                //System.out.println(imageDir);
                int[] target = im.findImages(imageDir + i + ".png",i);
                //System.out.println("找到一个点：" + target[0] + " : " + target[1]);
                if (target[0] == -1) {
                    if (i == 10) {
                        while (true) {
                            int[] target1 = im.findImages(imageDir + "flush" + ".png",100);
                            if (target1[0] != -1) {
                                Robot robot = new Robot();
                                robot.mouseMove(target1[0], target1[1]);
                                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                Thread.sleep(2000);
                                int[] target2 = im.findImages(imageDir + "flush1" + ".png",100);
                                if (target2[0] != -1) {
                                    robot.mouseMove(target2[0], target2[1]);
                                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                    Thread.sleep(4000);
                                    break;
                                }
                            }
                        }
                    }else if (i==9){
                        System.out.println(i);
                        i++;
                    }else if (i==7){
                        System.out.println(i);
                        i++;
                    }
                } else {
                    if(i==1){
                        startTang(ttkyzmttk.getTang_one(),target[0],target[1]);
                        i++;
                    }else if(i==2){
                        startTang(ttkyzmttk.getTang_two(),target[0],target[1]);
                        i++;
                    }else if(i==3){
                        startTang(ttkyzmttk.getTang_three(),target[0],target[1]);
                        i++;
                    }else if(i==4||i==5){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(200);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    }else if(i==9){
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(1000);

                        while (true) {
                            int[] target4 = im.findImages(imageDir + "sucess" + ".png",100);
                            if(target4[0]==-1){

                            }else{
                                robot.mouseMove(target4[0], target4[1]);
                                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                                i++;
                                break;
                            }
                        }
                    }else{
                        Robot robot = new Robot();
                        robot.mouseMove(target[0], target[1]);
                        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                        i++;
                    }
                    //Robot robot = new Robot();
                    //robot.mouseMove(target[0], target[1]);
                    //robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                    //robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                }
                System.out.println("当前步骤数:" + i);
            }
            t++;
        }
    }

    public static void chooseSkill(int x, int y, Robot robot, int one, int two,int truex,int truey) throws InterruptedException {
        if (one==1){
            robot.mouseMove(x,y);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(3000);
        }else{
            robot.mouseMove(x,y);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(two==1){
                truex=truex-720;
                truey=truey+100;
            }else if(two==2){
                truex=truex-520;
                truey=truey+100;
            }
            else if(two==3){
                truex=truex-220;
                truey=truey+100;
            }
            robot.mouseMove(truex,truey);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(3000);
        }
    }
    public static void fondskill(servlet s1, servlet s2, servlet s3, int x, int y) throws AWTException, InterruptedException {
        if(s1.getOne()!=0){
                chooseSkill(x-900,y+200,new Robot(),s1.getOne(),s1.getOne_choose(),x,y);
        }
        if(s1.getTwo()!=0){
            chooseSkill(x-830,y+200,new Robot(),s1.getTwo(),s1.getTwo_choose(),x,y);
        }
        if (s1.getThree()!=0){
            chooseSkill(x-750,y+200,new Robot(),s1.getThree(),s1.getThree_choose(),x,y);
        }
        if(s2.getOne()!=0){
            chooseSkill(x-650,y+200,new Robot(),s2.getOne(),s2.getOne_choose(),x,y);
        }
        if(s2.getTwo()!=0){
            System.out.println(s2);
            chooseSkill(x-570,y+200,new Robot(),s2.getTwo(),s2.getTwo_choose(),x,y);
        }
        if (s2.getThree()!=0){
            chooseSkill(x-500,y+200,new Robot(),s2.getThree(),s2.getThree_choose(),x,y);
        }
        if(s3.getOne()!=0){
            chooseSkill(x-400,y+200,new Robot(),s3.getOne(),s3.getOne_choose(),x,y);
        }
        if(s3.getTwo()!=0){
            chooseSkill(x-330,y+200,new Robot(),s3.getTwo(),s3.getTwo_choose(),x,y);
        }
        if (s3.getThree()!=0){
            chooseSkill(x-250,y+200,new Robot(),s3.getThree(),s3.getThree_choose(),x,y);
        }
    }

    public static void chooseCard(int x,int y,int one,Robot robot) throws InterruptedException {
        if(one == 1){
            robot.mouseMove(x-680,y-50);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 2){
            robot.mouseMove(x-400,y-50);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 3){
            robot.mouseMove(x-230,y-50);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 4){
            robot.mouseMove(x-820,y+100);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 5){
            robot.mouseMove(x-640,y+100);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 6){
            robot.mouseMove(x-460,y+100);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 7){
            robot.mouseMove(x-280,y+100);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        if(one == 8){
            robot.mouseMove(x-100,y+100);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
    }


    public static void startTang(tang t,int x, int y) throws AWTException, InterruptedException {
        servlet s1 = t.getOne_skill();
        servlet s2 = t.getTwo_skill();
        servlet s3 = t.getThree_skill();
        //s1.setOne(1);
        //s1.setTwo(2);
        //s1.setThree(2);
        //s1.setOne_choose(0);
        //s1.setTwo_choose(3);
        //s1.setThree_choose(3);
        //s2.setOne(1);
        //s2.setTwo(2);
        //s2.setThree(2);
        //s2.setOne_choose(0);
        //s2.setTwo_choose(3);
        //s2.setThree_choose(3);
        //s3.setOne(1);
        //s3.setTwo(1);
        //s3.setThree(1);
        //s3.setOne_choose(0);
        //s3.setTwo_choose(0);
        //s3.setThree_choose(0);
        //tang tone = new tang();
        //tone.setMaster_skill_one(0);
        //tone.setMaster_skill_two(0);
        //tone.setMaster_skill_three(4);
        servlet s4 = t.getOther_skill();
        //s4.setOne(1);
        //s4.setTwo(2);
        //s4.setThree(2);
        //s4.setOne_choose(0);
        //s4.setTwo_choose(3);
        //s4.setThree_choose(3);
        //tone.setMasterskill_one_who(1);
        //tone.setMasterskill_two_who(2);
        //tone.setMasterskill_three_who(3);
        //tone.setOne(3);
        //tone.setTwo(7);
        //tone.setThree(6);
        fondskill(s1,s2,s3,x,y);
        if(t.getMaster_skill_one()!=0||t.getMaster_skill_two()!=0||t.getMaster_skill_three()!=0){
            Robot robot = new Robot();
            if(t.getMaster_skill_one()!=0){
                robot.mouseMove(x, y);
                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(1000);
                chooseSkill(x-250,y,robot,t.getMaster_skill_one(),t.getMasterskill_one_who(),x,y);
                Thread.sleep(2000);
            }
            if(t.getMaster_skill_two()!=0){
                robot.mouseMove(x, y);
                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(1000);
                chooseSkill(x-180,y,robot,t.getMaster_skill_two(),t.getMasterskill_two_who(),x,y);
                Thread.sleep(2000);
            }
            if(t.getMaster_skill_three()!=0){
                robot.mouseMove(x, y);
                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
                robot.mouseMove(x-110, y);
                robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(1000);
                if(t.getMaster_skill_three()==3){
                    robot.mouseMove(x-60, y);
                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                    Thread.sleep(500);
                    robot.mouseMove(x-850, y);
                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                    Thread.sleep(500);
                    robot.mouseMove(x-425, y+240);
                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                    Thread.sleep(6000);
                    ImageMatch im = new ImageMatch();
                    String imageDir = "D:/test/";
                    while (true) {
                        int[] target1 = im.findImages(imageDir + "change" + ".png",100);
                        if (target1[0] != -1) {
                            break;
                        }
                    }

                    if(s4.getOne()!=0){
                        chooseSkill(x-900,y+200,new Robot(),s4.getOne(),s4.getOne_choose(),x,y);
                    }
                    if(s4.getTwo()!=0){
                        chooseSkill(x-830,y+200,new Robot(),s4.getTwo(),s4.getTwo_choose(),x,y);
                    }
                    if (s4.getThree()!=0){
                        chooseSkill(x-750,y+200,new Robot(),s4.getThree(),s4.getThree_choose(),x,y);
                    }



                }else {
                    chooseSkill(x - 110, y, robot, t.getMaster_skill_three(), t.getMasterskill_three_who(), x, y);
                    Thread.sleep(2000);
                }
            }
        }
        Robot robot = new Robot();
        robot.mouseMove(x-50, y+230);
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        chooseCard(x,y,t.getOne(),robot);
        chooseCard(x,y,t.getTwo(),robot);
        chooseCard(x,y,t.getThree(),robot);
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

    public int[] findImages(String imagePath,int i) {
        System.out.println(imagePath);
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
                if(i==10){
                    if(max.getMax()>=75){
                        break;
                    }
                }else{
                    if(max.getMax()>=40){
                        break;
                    }
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
                        if(i==10){
                            if(max.getMax()>=75){
                                break;
                            }
                        }else{
                            if(max.getMax()>=40){
                                break;
                            }
                        }
                    }

                }
            }

        }
        if(i==10){
            if (max.getMax() >= 75) {
                System.out.println("像素点X" + max.getX() + " : Y" + max.getY() + "，对应的值为：" + bigData[max.getX()][max.getY()]);
                // 获取小图的中心位置的点
                System.out.println((smallHeight * smallWidth));
                System.out.println(max.getMax());
                int centerX = max.getX() + smallWidth / 2;
                int centerY = max.getY() + smallHeight / 2;
                target[0] = centerX;
                target[1] = centerY;
                return target;
            }
        }else {
            if (max.getMax() >= 40) {
                System.out.println("像素点X" + max.getX() + " : Y" + max.getY() + "，对应的值为：" + bigData[max.getX()][max.getY()]);
                // 获取小图的中心位置的点
                System.out.println((smallHeight * smallWidth));
                System.out.println(max.getMax());
                int centerX = max.getX() + smallWidth / 2;
                int centerY = max.getY() + smallHeight / 2;
                target[0] = centerX;
                target[1] = centerY;
                return target;
            }
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