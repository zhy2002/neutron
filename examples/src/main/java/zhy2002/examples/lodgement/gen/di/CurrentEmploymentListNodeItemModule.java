package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CurrentEmploymentListNodeItemScope
public class CurrentEmploymentListNodeItemModule {

    private final CurrentEmploymentListNode parent;

    public CurrentEmploymentListNodeItemModule(CurrentEmploymentListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @CurrentEmploymentListNodeItemScope
    CurrentEmploymentNode provideCurrentEmploymentNode(
        MembersInjector<CurrentEmploymentNode> injector
    ) {
        CurrentEmploymentNode node = new CurrentEmploymentNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}