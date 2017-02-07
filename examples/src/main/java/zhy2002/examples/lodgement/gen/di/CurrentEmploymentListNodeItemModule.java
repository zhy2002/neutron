package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CurrentEmploymentListNodeItemScope
public class CurrentEmploymentListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @CurrentEmploymentListNodeItemScope
    CurrentEmploymentNode provideCurrentEmploymentNode(
        CurrentEmploymentListNode parent,
        MembersInjector<CurrentEmploymentNode> injector
    ) {
        CurrentEmploymentNode node = new CurrentEmploymentNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}