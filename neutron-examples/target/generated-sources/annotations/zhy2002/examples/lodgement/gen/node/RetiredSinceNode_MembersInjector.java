package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RetiredSinceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNode_MembersInjector implements MembersInjector<RetiredSinceNode> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  private final Provider<RetiredSinceNodeComponent.Builder> builderProvider;

  public RetiredSinceNode_MembersInjector(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<RetiredSinceNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RetiredSinceNode> create(
      Provider<MonthYearNodeChildProvider> providerProvider,
      Provider<RetiredSinceNodeComponent.Builder> builderProvider) {
    return new RetiredSinceNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(RetiredSinceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((MonthYearNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      RetiredSinceNode instance, Provider<RetiredSinceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
