package adapterpattern.again.v1;

import adapterpattern.again.HandlerAdapter;
import adapterpattern.again.domain.ClassA;
import adapterpattern.again.domain.ClassB;
import adapterpattern.again.domain.MyRequest;
import adapterpattern.again.domain.ResultClass;

public class V1HandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof ControllerV1);
    }

    @Override
    public ResultClass handle(MyRequest myRequest, Object handler) {
        ControllerV1 controllerV1 = (ControllerV1) handler;

        String a = myRequest.getA();
        String b = myRequest.getB();

        ClassA classA = new ClassA(a);
        ClassB classB = new ClassB(b);

        ResultClass resultClass = controllerV1.process(classA, classB);
        return resultClass;
    }
}
