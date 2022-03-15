package week5;

public class Demo {
    public static void main(String[] args) {

        Object mp0=new Object();
        MediaPlayer mp1=new MediaPlayer("Media Player",0);

        AudioPlayer mp2=new AudioPlayer("Audio Player",0,"Wave",24);


        //mp0
        //mp1
        //mp2
        mp1=(MediaPlayer) mp0;

        //upcast implicit
        mp0=mp1;

        //downcast explicit
        mp2=(AudioPlayer) mp1;

        //type casting
        mp2=(AudioPlayer) mp0;

        Object object1;
        Object object2;

        object1=mp0;
        object2=mp1;

        //array declaration and initilization
        int arr[]=new int[11];

        int arr3[]={1,2,4,5};

        int[] arr1=new int[20];

        int[] a,b=new int[5],c;
        a=new int[5];

        arr3[0]=5;
        System.out.println(arr3[0]);


        float fArr[]=new float[4];


        MediaPlayer[] mediaPlayers=new MediaPlayer[5];
        System.out.println(mediaPlayers[0]);
        mediaPlayers[0]=mp1;
        mediaPlayers[1]=new MediaPlayer("",1);


    }
}
