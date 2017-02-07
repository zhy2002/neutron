package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PayeEmployedNodeChildScope
public class PayeEmployedNodeChildModule {


    @Provides
    @PayeEmployedNodeChildScope
    @Named("grossYearlySalaryNode")
    GrossYearlySalaryNode provideGrossYearlySalaryNode(
        PayeEmployedNode parent,
        MembersInjector<GrossYearlySalaryNode> injector
    ) {
        GrossYearlySalaryNode node = new GrossYearlySalaryNode(parent, "grossYearlySalaryNode");

        injector.injectMembers(node);
        return node;
    }

}