package adapterpattern.again;

import adapterpattern.again.domain.MyRequest;
import adapterpattern.again.v1.ControllerV1;
import adapterpattern.again.v1.MyControllerV1;
import adapterpattern.again.v1.V1HandlerAdapter;
import adapterpattern.again.v2.V2HandlerAdapter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HandlerAdapter> handlerAdapterList = Arrays.asList(new V1HandlerAdapter(), new V2HandlerAdapter());
        ControllerV1 controllerV1 = new MyControllerV1();
        HandlerAdapter handlerAdapter = getHandlerAdapter(handlerAdapterList, controllerV1);
        MyRequest myRequest = new MyRequest();
        handlerAdapter.handle(myRequest, controllerV1);

    }

    private static HandlerAdapter getHandlerAdapter(List<HandlerAdapter> handlerAdapterList, ControllerV1 controllerV1) {
        for (HandlerAdapter handlerAdapter : handlerAdapterList) {
            if(handlerAdapter.supports(controllerV1)) {
                return handlerAdapter;
            }
        }
    }
}
