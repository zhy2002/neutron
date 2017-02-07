package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@LoanListNodeItemScope
public class LoanListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @LoanListNodeItemScope
    LoanNode provideLoanNode(
        LoanListNode parent,
        MembersInjector<LoanNode> injector
    ) {
        LoanNode node = new LoanNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}