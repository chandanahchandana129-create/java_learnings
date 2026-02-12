class demo2{
    public static void main(String[] args) {
        String[] playlist1 = new String[3];
        playlist1[0]= "song1" ;
        System.out.println(playlist1[0]);
        playlist1[1]="song2";
        System.out.println(playlist1[1]);
    }
}


class ArrayMin{
    public static void main(String[] args) {
        int[] arr = {10,20,60,80};
        int min=arr[0];
        for (int i = 0;i<arr.length;i++){
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("min:"+min);
    }
}