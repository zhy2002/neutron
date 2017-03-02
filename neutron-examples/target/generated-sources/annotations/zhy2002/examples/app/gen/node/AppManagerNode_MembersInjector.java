package zhy2002.examples.app.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.app.gen.di.AppManagerNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppManagerNode_MembersInjector implements MembersInjector<AppManagerNode> {
  private final Provider<AppManagerNodeComponent.Builder> builderProvider;

  public AppManagerNode_MembersInjector(Provider<AppManagerNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AppManagerNode> create(
      Provider<AppManagerNodeComponent.Builder> builderProvider) {
    return new AppManagerNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AppManagerNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AppManagerNode instance, Provider<AppManagerNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
