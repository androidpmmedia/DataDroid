/**
 * 2011 Foxykeep (http://datadroid.foxykeep.com)
 * <p>
 * Licensed under the Beerware License : <br />
 * As long as you retain this notice you can do whatever you want with this stuff. If we meet some
 * day, and you think this stuff is worth it, you can buy me a beer in return
 */

package com.foxykeep.datadroidpoc.config;

public final class WSConfig {

  private WSConfig() {
    // No public constructor
  }

  public static final String ROOT_URL = "http://foxykeep.com/projects/datadroid/";
  public static final String HTTPBIN_ROOT_URL = "https://httpbin.org/";

  // PersonList WS
  public static final String WS_PERSON_LIST_URL_XML = ROOT_URL + "personListXml.php";
  public static final String WS_PERSON_LIST_URL_JSON = ROOT_URL + "personListJson.php";

  // CityList WS
  public static final String WS_CITY_LIST_URL = ROOT_URL + "cityListJson.php";

  public static final String WS_CITY_PROPERTY_VERSION = "version";

  // CityList2 WS
  public static final String WS_CITY_LIST_2_URL = ROOT_URL + "cityList2Json.php";

  // Authentication WS
  public static final String WS_AUTHENTICATION_URL = ROOT_URL + "authentication/authentication.php";

  // CrudPhoneList WS
  public static final String WS_CRUD_PHONE_LIST_URL = ROOT_URL + "crud/list.php";

  public static final String WS_CRUD_PHONE_LIST_PROPERTY_USER_UDID = "userUdid";

  // CrudPhoneDelete WS
  public static final String WS_CRUD_PHONE_DELETE_URL = ROOT_URL + "crud/delete.php";

  public static final String WS_CRUD_PHONE_DELETE_PROPERTY_USER_UDID = "userUdid";
  public static final String WS_CRUD_PHONE_DELETE_PROPERTY_IDS = "ids";

  // CrudPhoneAddEdit WS
  public static final String WS_CRUD_PHONE_ADD_EDIT_URL = ROOT_URL + "crud/addedit.php";

  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_USER_UDID = "userUdid";
  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_ID = "id";
  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_NAME = "name";
  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_MANUFACTURER = "manufacturer";
  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_ANDROID_VERSION = "androidVersion";
  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_SCREEN_SIZE = "screenSize";
  public static final String WS_CRUD_PHONE_ADD_EDIT_PROPERTY_PRICE = "price";

  // Request Types WS
  public static final String WS_REQUEST_TYPES_GET =
      "https://github" + ".com/foxykeep/DataDroid/issues/33"; //HTTPBIN_ROOT_URL + "get";
  public static final String WS_REQUEST_TYPES_POST = HTTPBIN_ROOT_URL + "post";
  public static final String WS_REQUEST_TYPES_PUT = HTTPBIN_ROOT_URL + "put";
  public static final String WS_REQUEST_TYPES_DELETE = HTTPBIN_ROOT_URL + "delete";

  public static final String WS_REQUEST_TYPE_NUMBER = "number";
}
