package adapterpattern.again.v2;

import adapterpattern.again.domain.ClassB;
import adapterpattern.again.domain.ClassC;
import adapterpattern.again.domain.ResultClass;

public class MyControllerV2 implements ControllerV2 {
    @Override
    public ResultClass process(ClassB classB, ClassC classC) {
        return new ResultClass(classB, classC);
    }
}
