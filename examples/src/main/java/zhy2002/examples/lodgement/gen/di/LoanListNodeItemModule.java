package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    LoanNodeChildComponent.class
})
@LoanListNodeItemScope
public class LoanListNodeItemModule {

    private final LoanListNode parent;

    public LoanListNodeItemModule(LoanListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @LoanListNodeItemScope
    LoanNode provideLoanNode(
        MembersInjector<LoanNode> injector
    ) {
        LoanNode node = new LoanNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}