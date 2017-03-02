package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.UnemployedSinceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedSinceNode_MembersInjector
    implements MembersInjector<UnemployedSinceNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<UnemployedSinceNodeComponent.Builder> builderProvider;

  public UnemployedSinceNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<UnemployedSinceNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<UnemployedSinceNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<UnemployedSinceNodeComponent.Builder> builderProvider) {
    return new UnemployedSinceNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(UnemployedSinceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      UnemployedSinceNode instance,
      Provider<UnemployedSinceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
