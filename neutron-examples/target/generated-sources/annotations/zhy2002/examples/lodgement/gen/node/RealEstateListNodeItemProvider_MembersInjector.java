package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateListNodeItemProvider_MembersInjector
    implements MembersInjector<RealEstateListNodeItemProvider> {
  private final MembersInjector<RealEstateNode> realEstateNodeInjectorMembersInjector;

  public RealEstateListNodeItemProvider_MembersInjector(
      MembersInjector<RealEstateNode> realEstateNodeInjectorMembersInjector) {
    assert realEstateNodeInjectorMembersInjector != null;
    this.realEstateNodeInjectorMembersInjector = realEstateNodeInjectorMembersInjector;
  }

  public static MembersInjector<RealEstateListNodeItemProvider> create(
      MembersInjector<RealEstateNode> realEstateNodeInjectorMembersInjector) {
    return new RealEstateListNodeItemProvider_MembersInjector(
        realEstateNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(RealEstateListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.realEstateNodeInjector = realEstateNodeInjectorMembersInjector;
  }

  public static void injectRealEstateNodeInjector(
      RealEstateListNodeItemProvider instance,
      MembersInjector<RealEstateNode> realEstateNodeInjector) {
    instance.realEstateNodeInjector = realEstateNodeInjector;
  }
}
