package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MovedFromPreviousAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedFromPreviousAddressNode_MembersInjector
    implements MembersInjector<MovedFromPreviousAddressNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<MovedFromPreviousAddressNodeComponent.Builder> builderProvider;

  public MovedFromPreviousAddressNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<MovedFromPreviousAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MovedFromPreviousAddressNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<MovedFromPreviousAddressNodeComponent.Builder> builderProvider) {
    return new MovedFromPreviousAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(MovedFromPreviousAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MovedFromPreviousAddressNode instance,
      Provider<MovedFromPreviousAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
