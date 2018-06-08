package PrintDemo.Imp;

import PrintDemo.Interface.IInkBox;

public class ColorInkBokImpl implements IInkBox{

    @Override
    public String getColor() {
        return "Red";
    }
}
