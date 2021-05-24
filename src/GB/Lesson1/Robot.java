package GB.Lesson1;

public class Robot implements RunAndJump{
    int maxLength;
    int maxHeight;
    String model;

    public Robot(int maxLength,int maxHeight,String model){
        this.maxHeight=maxHeight;
        this.maxLength=maxLength;
        this.model=model;
    }
    @Override
    public int getMaxHeight(){
        return maxHeight;
    }
    @Override
    public void jump(){
        System.out.println("Robot jump");
    }
    @Override
    public int getMaxLength(){
        return maxLength;
    }
    @Override
    public void run(){
        System.out.println("Robot run");
    }
    public String toString(){
        return "Model:"+" "+ model;
    }
}
