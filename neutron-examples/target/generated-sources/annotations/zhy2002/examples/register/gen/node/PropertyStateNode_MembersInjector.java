package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PropertyStateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyStateNode_MembersInjector implements MembersInjector<PropertyStateNode> {
  private final Provider<PropertyStateNodeComponent.Builder> builderProvider;

  public PropertyStateNode_MembersInjector(
      Provider<PropertyStateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyStateNode> create(
      Provider<PropertyStateNodeComponent.Builder> builderProvider) {
    return new PropertyStateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PropertyStateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyStateNode instance, Provider<PropertyStateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
