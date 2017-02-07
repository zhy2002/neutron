package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PreviousEmploymentListNodeItemScope
public class PreviousEmploymentListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @PreviousEmploymentListNodeItemScope
    PreviousEmploymentNode providePreviousEmploymentNode(
        PreviousEmploymentListNode parent,
        MembersInjector<PreviousEmploymentNode> injector
    ) {
        PreviousEmploymentNode node = new PreviousEmploymentNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}