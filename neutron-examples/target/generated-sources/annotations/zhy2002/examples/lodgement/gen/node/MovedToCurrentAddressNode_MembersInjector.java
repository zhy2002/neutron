package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MovedToCurrentAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToCurrentAddressNode_MembersInjector
    implements MembersInjector<MovedToCurrentAddressNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<MovedToCurrentAddressNodeComponent.Builder> builderProvider;

  public MovedToCurrentAddressNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<MovedToCurrentAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MovedToCurrentAddressNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<MovedToCurrentAddressNodeComponent.Builder> builderProvider) {
    return new MovedToCurrentAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(MovedToCurrentAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MovedToCurrentAddressNode instance,
      Provider<MovedToCurrentAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
