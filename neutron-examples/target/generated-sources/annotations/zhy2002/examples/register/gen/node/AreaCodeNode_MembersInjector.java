package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.AreaCodeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNode_MembersInjector implements MembersInjector<AreaCodeNode> {
  private final Provider<AreaCodeNodeComponent.Builder> builderProvider;

  public AreaCodeNode_MembersInjector(Provider<AreaCodeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AreaCodeNode> create(
      Provider<AreaCodeNodeComponent.Builder> builderProvider) {
    return new AreaCodeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AreaCodeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AreaCodeNode instance, Provider<AreaCodeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
