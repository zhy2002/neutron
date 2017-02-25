package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MobileNumberNodeModule {

    private final MobileNumberNode owner;

    public MobileNumberNodeModule(MobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @MobileNumberNodeScope @Owner MobileNumberNode provideMobileNumberNode() {
        return owner;
    }

    @Provides @MobileNumberNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MobileNumberNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MobileNumberNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}