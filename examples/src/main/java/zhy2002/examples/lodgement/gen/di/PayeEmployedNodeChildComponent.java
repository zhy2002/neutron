package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PayeEmployedNodeChildScope
@Subcomponent(modules = {PayeEmployedNodeChildModule.class})
public interface PayeEmployedNodeChildComponent {

    GrossYearlySalaryNode provideGrossYearlySalaryNode(@Named("grossYearlySalaryNode") GrossYearlySalaryNode impl);

}
