package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@MotorVehicleListNodeItemScope
@Subcomponent(modules = {MotorVehicleListNodeItemModule.class})
public interface MotorVehicleListNodeItemComponent {

    MotorVehicleNode provideMotorVehicleNode();

}
