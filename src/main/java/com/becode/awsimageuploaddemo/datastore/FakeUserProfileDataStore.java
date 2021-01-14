package com.becode.awsimageuploaddemo.datastore;


import org.springframework.stereotype.Repository;
//careful when importing things called UserProfile as it is a part of AWS itself.
import com.becode.awsimageuploaddemo.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class FakeUserProfileDataStore  {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<UserProfile>();


    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null ));

    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}