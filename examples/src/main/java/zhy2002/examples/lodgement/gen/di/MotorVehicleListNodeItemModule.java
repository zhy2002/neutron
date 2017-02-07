package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    MotorVehicleNodeChildComponent.class
})
@MotorVehicleListNodeItemScope
public class MotorVehicleListNodeItemModule {

    private final MotorVehicleListNode parent;

    public MotorVehicleListNodeItemModule(MotorVehicleListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @MotorVehicleListNodeItemScope
    MotorVehicleNode provideMotorVehicleNode(
        MembersInjector<MotorVehicleNode> injector
    ) {
        MotorVehicleNode node = new MotorVehicleNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}