package adapterpattern.again.v1;

import adapterpattern.again.domain.ClassA;
import adapterpattern.again.domain.ClassB;
import adapterpattern.again.domain.ResultClass;

public class MyControllerV1 implements ControllerV1 {
    @Override
    public ResultClass process(ClassA a, ClassB b) {
        return new ResultClass(a, b);
    }
}
