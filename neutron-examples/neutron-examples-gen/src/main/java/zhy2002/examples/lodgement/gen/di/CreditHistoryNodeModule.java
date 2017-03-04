package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditHistoryNodeModule {

    private final CreditHistoryNode owner;

    public CreditHistoryNodeModule(CreditHistoryNode owner) {
        this.owner = owner;
    }

    @Provides @CreditHistoryNodeScope @Owner CreditHistoryNode provideCreditHistoryNode() {
        return owner;
    }

    @Provides @CreditHistoryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CreditHistoryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditHistoryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditHistoryNodeScope CreditHistoryListNode provideCreditHistoryListNode() {
        return owner.getParent();
    }

}