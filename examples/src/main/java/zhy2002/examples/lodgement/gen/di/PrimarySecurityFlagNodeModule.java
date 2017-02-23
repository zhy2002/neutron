package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PrimarySecurityFlagNodeModule {

    private final PrimarySecurityFlagNode owner;

    public PrimarySecurityFlagNodeModule(PrimarySecurityFlagNode owner) {
        this.owner = owner;
    }

    @Provides @PrimarySecurityFlagNodeScope @Owner PrimarySecurityFlagNode providePrimarySecurityFlagNode() {
        return owner;
    }

    @Provides @PrimarySecurityFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PrimarySecurityFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PrimarySecurityFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}