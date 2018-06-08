package PrintDemo.Imp;

import PrintDemo.Interface.IPaper;

public class B5PaperImpl implements IPaper{

    @Override
    public String getSize() {
        return "B5";
    }
}
