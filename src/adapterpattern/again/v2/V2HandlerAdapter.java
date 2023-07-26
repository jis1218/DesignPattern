package adapterpattern.again.v2;

import adapterpattern.again.HandlerAdapter;
import adapterpattern.again.domain.*;
import adapterpattern.again.v1.ControllerV1;

public class V2HandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof ControllerV2);
    }

    @Override
    public ResultClass handle(MyRequest myRequest, Object handler) {
        ControllerV2 controllerV2 = (ControllerV2) handler;

        String b = myRequest.getB();
        String c = myRequest.getC();

        ClassB classB = new ClassB(b);
        ClassC classC = new ClassC(c);

        ResultClass resultClass = controllerV2.process(classB, classC);
        return resultClass;
    }
}
