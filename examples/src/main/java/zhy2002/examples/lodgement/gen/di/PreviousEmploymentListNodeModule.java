package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PreviousEmploymentListNodeModule {

    private final PreviousEmploymentListNode owner;

    public PreviousEmploymentListNodeModule(PreviousEmploymentListNode owner) {
        this.owner = owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner PreviousEmploymentListNode providePreviousEmploymentListNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}