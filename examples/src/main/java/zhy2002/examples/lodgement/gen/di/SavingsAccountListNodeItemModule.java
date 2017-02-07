package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    SavingsAccountNodeChildComponent.class
})
@SavingsAccountListNodeItemScope
public class SavingsAccountListNodeItemModule {

    private final SavingsAccountListNode parent;

    public SavingsAccountListNodeItemModule(SavingsAccountListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @SavingsAccountListNodeItemScope
    SavingsAccountNode provideSavingsAccountNode(
        MembersInjector<SavingsAccountNode> injector
    ) {
        SavingsAccountNode node = new SavingsAccountNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}