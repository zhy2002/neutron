package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertyWeeklyRentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyWeeklyRentNode_MembersInjector
    implements MembersInjector<PropertyWeeklyRentNode> {
  private final Provider<PropertyWeeklyRentNodeComponent.Builder> builderProvider;

  public PropertyWeeklyRentNode_MembersInjector(
      Provider<PropertyWeeklyRentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyWeeklyRentNode> create(
      Provider<PropertyWeeklyRentNodeComponent.Builder> builderProvider) {
    return new PropertyWeeklyRentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PropertyWeeklyRentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyWeeklyRentNode instance,
      Provider<PropertyWeeklyRentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
