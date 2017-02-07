package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@Module(subcomponents = {
})
@ErrorListNodeItemScope
public class ErrorListNodeItemModule {

    private final ErrorListNode parent;

    public ErrorListNodeItemModule(ErrorListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @ErrorListNodeItemScope
    ErrorNode provideErrorNode(
        MembersInjector<ErrorNode> injector
    ) {
        ErrorNode node = new ErrorNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}