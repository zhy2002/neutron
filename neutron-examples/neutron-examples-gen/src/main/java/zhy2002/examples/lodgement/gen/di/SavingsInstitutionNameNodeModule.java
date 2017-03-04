package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsInstitutionNameNodeModule {

    private final SavingsInstitutionNameNode owner;

    public SavingsInstitutionNameNodeModule(SavingsInstitutionNameNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner SavingsInstitutionNameNode provideSavingsInstitutionNameNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

}