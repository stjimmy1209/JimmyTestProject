package PrintDemo;

import PrintDemo.Interface.IInkBox;
import PrintDemo.Interface.IPaper;

// use the ink box and paper to print
public class Printer{

    private IInkBox inkbox = null; // ink box
    private IPaper paper = null; // paper

    public void print(String content){

        if(null == inkbox|| null == paper){
            System.out.println("Error in inkbox and paper, please reinstall and try again");
            return;
        }
        // print
        String color = inkbox.getColor();
        String type = paper.getSize();
        System.out.println("the content is in: " + color );
        System.out.println("paper used is: " + type);
        System.out.println("content is: " + content);

    }


    public void setInkbox(IInkBox inkbox) {
        this.inkbox = inkbox;
    }


    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
}
