package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@MotorVehicleListNodeItemScope
public class MotorVehicleListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @MotorVehicleListNodeItemScope
    MotorVehicleNode provideMotorVehicleNode(
        MotorVehicleListNode parent,
        MembersInjector<MotorVehicleNode> injector
    ) {
        MotorVehicleNode node = new MotorVehicleNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}