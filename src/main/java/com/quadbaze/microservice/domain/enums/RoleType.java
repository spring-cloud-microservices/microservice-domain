package com.quadbaze.microservice.domain.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Olatunji O. Longe on 4/16/2016.
 */
public enum RoleType {
    MANAGEMENT("Management"),
    SUPER_ADMIN("Super-Admin"),
    ADMIN("Admin"),
    USER("User"),
    REST_CLIENT("Rest-Client");

    private String displayName;

    RoleType(String displayName){
        this.displayName = displayName;
    }

    public String displayName() {
        return this.displayName;
    }

    public static List<String> allRoleNames(){
        List<String> list = new ArrayList<>();
        RoleType[] roles = RoleType.values();
        for(RoleType role : roles){
            list.add(role.name());
        }
        return list;
    }

    public static List<String> roleNames(List<RoleType> roles){
        List<String> list = new ArrayList<>();
        for(RoleType role : roles){
            list.add(role.name());
        }
        return list;
    }

    public static List<RoleType> managementEditableRoles(){
        return Arrays.asList(RoleType.SUPER_ADMIN, RoleType.REST_CLIENT);
    }

    public static List<String> managementEditableRoleNames(){
        List<String> list = new ArrayList<>();
        for(RoleType role : managementEditableRoles()){
            list.add(role.name());
        }
        return list;
    }

    public static List<RoleType> adminRoles(){
        return Arrays.asList(RoleType.SUPER_ADMIN, RoleType.ADMIN);
    }

    public static List<String> adminRoleNames(){
        List<String> list = new ArrayList<>();
        for(RoleType role : adminRoles()){
            list.add(role.name());
        }
        return list;
    }

    public static List<RoleType> nonAdminRoles(){
        return Arrays.asList(RoleType.USER, RoleType.REST_CLIENT);
    }

    public static List<String> nonAdminRoleNames(){
        List<String> list = new ArrayList<>();
        for(RoleType role : nonAdminRoles()){
            list.add(role.name());
        }
        return list;
    }

    public static List<RoleType> primaryRoles(){
        return Arrays.asList(RoleType.ADMIN, RoleType.USER);
    }

    public static List<String> primaryRoleNames(){
        List<String> list = new ArrayList<>();
        for(RoleType role : primaryRoles()){
            list.add(role.name());
        }
        return list;
    }

    public static List<RoleType> managementOnlyRole(){
        return Arrays.asList(RoleType.MANAGEMENT);
    }

    public static List<RoleType> superAdminOnlyRole(){
        return Arrays.asList(RoleType.SUPER_ADMIN);
    }

    public static List<RoleType> userOnlyRole(){
        return Arrays.asList(RoleType.USER);
    }

    public static List<RoleType> restClientOnlyRole(){
        return Arrays.asList(RoleType.USER);
    }

}
