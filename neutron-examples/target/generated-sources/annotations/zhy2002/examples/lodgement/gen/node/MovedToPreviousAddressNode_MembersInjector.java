package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MovedToPreviousAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNode_MembersInjector
    implements MembersInjector<MovedToPreviousAddressNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<MovedToPreviousAddressNodeComponent.Builder> builderProvider;

  public MovedToPreviousAddressNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<MovedToPreviousAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MovedToPreviousAddressNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<MovedToPreviousAddressNodeComponent.Builder> builderProvider) {
    return new MovedToPreviousAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(MovedToPreviousAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MovedToPreviousAddressNode instance,
      Provider<MovedToPreviousAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
