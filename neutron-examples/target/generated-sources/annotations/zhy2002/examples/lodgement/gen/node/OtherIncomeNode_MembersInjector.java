package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherIncomeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNode_MembersInjector implements MembersInjector<OtherIncomeNode> {
  private final Provider<OtherIncomeNodeChildProvider> providerProvider;

  private final Provider<OtherIncomeNodeComponent.Builder> builderProvider;

  public OtherIncomeNode_MembersInjector(
      Provider<OtherIncomeNodeChildProvider> providerProvider,
      Provider<OtherIncomeNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherIncomeNode> create(
      Provider<OtherIncomeNodeChildProvider> providerProvider,
      Provider<OtherIncomeNodeComponent.Builder> builderProvider) {
    return new OtherIncomeNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(OtherIncomeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      OtherIncomeNode instance, Provider<OtherIncomeNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      OtherIncomeNode instance, Provider<OtherIncomeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
