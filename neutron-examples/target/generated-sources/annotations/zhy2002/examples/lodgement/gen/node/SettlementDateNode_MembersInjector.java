package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SettlementDateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettlementDateNode_MembersInjector
    implements MembersInjector<SettlementDateNode> {
  private final Provider<SettlementDateNodeComponent.Builder> builderProvider;

  public SettlementDateNode_MembersInjector(
      Provider<SettlementDateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SettlementDateNode> create(
      Provider<SettlementDateNodeComponent.Builder> builderProvider) {
    return new SettlementDateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SettlementDateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SettlementDateNode instance, Provider<SettlementDateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
