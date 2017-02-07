package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PreviousEmploymentListNodeItemScope
public class PreviousEmploymentListNodeItemModule {

    private final PreviousEmploymentListNode parent;

    public PreviousEmploymentListNodeItemModule(PreviousEmploymentListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @PreviousEmploymentListNodeItemScope
    PreviousEmploymentNode providePreviousEmploymentNode(
        MembersInjector<PreviousEmploymentNode> injector
    ) {
        PreviousEmploymentNode node = new PreviousEmploymentNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}