package PrintDemo.Imp;

import PrintDemo.Interface.IPaper;

public class A4PaperImpl implements IPaper{

    @Override
    public String getSize() {
        return "A4";
    }
}
