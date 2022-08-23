package drillexercises;

public class box {
    public static void main(String[] args) {
        private static int Width,Height,Depth;
        private static String Builder;
public  Box(int W,int H,int D)
        {
            Width=W;
            Height=H;
            Depth=D;
            Builder="null";
        }
 public  Box(int W,int H,int D,String B)
        {
            Width=W;
            Height=H;
            Depth=D;
            Builder=B;
        }
        public String printMe()
        {

            String Output=""+"\nBox Built"+"\n\tWidth: "+Width+"\n\tHeight: "+Height+"\n\tDepth: "+Depth+"\n\tBuilt by\n"+Builder;
            return Output;
        }
    }
}
