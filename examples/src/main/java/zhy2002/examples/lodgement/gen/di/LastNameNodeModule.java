package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LastNameNodeModule {

    private final LastNameNode owner;

    public LastNameNodeModule(LastNameNode owner) {
        this.owner = owner;
    }

    @Provides @LastNameNodeScope @Owner LastNameNode provideLastNameNode() {
        return owner;
    }

    @Provides @LastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}