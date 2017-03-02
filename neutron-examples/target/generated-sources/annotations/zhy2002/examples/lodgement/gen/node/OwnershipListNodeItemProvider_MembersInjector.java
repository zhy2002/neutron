package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipListNodeItemProvider_MembersInjector
    implements MembersInjector<OwnershipListNodeItemProvider> {
  private final MembersInjector<OwnershipNode> ownershipNodeInjectorMembersInjector;

  public OwnershipListNodeItemProvider_MembersInjector(
      MembersInjector<OwnershipNode> ownershipNodeInjectorMembersInjector) {
    assert ownershipNodeInjectorMembersInjector != null;
    this.ownershipNodeInjectorMembersInjector = ownershipNodeInjectorMembersInjector;
  }

  public static MembersInjector<OwnershipListNodeItemProvider> create(
      MembersInjector<OwnershipNode> ownershipNodeInjectorMembersInjector) {
    return new OwnershipListNodeItemProvider_MembersInjector(ownershipNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OwnershipListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.ownershipNodeInjector = ownershipNodeInjectorMembersInjector;
  }

  public static void injectOwnershipNodeInjector(
      OwnershipListNodeItemProvider instance,
      MembersInjector<OwnershipNode> ownershipNodeInjector) {
    instance.ownershipNodeInjector = ownershipNodeInjector;
  }
}
