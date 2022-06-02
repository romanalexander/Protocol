package org.cloudburstmc.protocol.bedrock.packet;

public enum BedrockPacketType {
    ADD_BEHAVIOR_TREE,
    ADD_ENTITY,
    ADD_HANGING_ENTITY,
    ADD_ITEM_ENTITY,
    ADD_PAINTING,
    ADD_PLAYER,
    ADD_VOLUME_ENTITY,
    ADVENTURE_SETTINGS,
    AGENT_ACTION_EVENT,
    ANIMATE,
    ANIMATE_ENTITY,
    ANVIL_DAMAGE,
    AUTOMATION_CLIENT_CONNECT,
    AVAILABLE_COMMANDS,
    AVAILABLE_ENTITY_IDENTIFIERS,
    BIOME_DEFINITIONS_LIST,
    BLOCK_ENTITY_DATA,
    BLOCK_EVENT,
    BLOCK_PICK_REQUEST,
    BOOK_EDIT,
    BOSS_EVENT,
    CAMERA,
    CAMERA_SHAKE,
    CHANGE_DIMENSION,
    CHANGE_MOB_PROPERTY,
    CHUNK_RADIUS_UPDATED,
    CLIENTBOUND_MAP_ITEM_DATA,
    CLIENT_CACHE_BLOB_STATUS,
    CLIENT_CACHE_MISS_RESPONSE,
    CLIENT_CACHE_STATUS,
    CLIENT_TO_SERVER_HANDSHAKE,
    CODE_BUILDER,
    CODE_BUILDER_SOURCE,
    COMMAND_BLOCK_UPDATE,
    COMMAND_OUTPUT,
    COMMAND_REQUEST,
    COMPLETED_USING_ITEM,
    CONTAINER_CLOSE,
    CONTAINER_OPEN,
    CONTAINER_SET_DATA,
    CORRECT_PLAYER_MOVE_PREDICTION,
    CRAFTING_DATA,
    CRAFTING_EVENT,
    CREATE_PHOTO,
    CREATIVE_CONTENT,
    DEBUG_INFO,
    DIMENSION_DATA,
    DISCONNECT,
    EDUCATION_SETTINGS,
    EDU_URI_RESOURCE,
    EMOTE,
    EMOTE_LIST,
    ENTITY_EVENT,
    ENTITY_FALL,
    ENTITY_PICK_REQUEST,
    EVENT,
    EXPLODE,
    FILTER_TEXT,
    GAME_RULES_CHANGED,
    GUI_DATA_PICK_ITEM,
    HURT_ARMOR,
    INTERACT,
    INVENTORY_CONTENT,
    INVENTORY_SLOT,
    INVENTORY_TRANSACTION,
    ITEM_COMPONENT,
    ITEM_FRAME_DROP_ITEM,
    ITEM_STACK_REQUEST,
    ITEM_STACK_RESPONSE,
    LAB_TABLE,
    LECTERN_UPDATE,
    LESSON_PROGRESS,
    LEVEL_CHUNK,
    LEVEL_EVENT_GENERIC,
    LEVEL_EVENT,
    LEVEL_SOUND_EVENT,
    LEVEL_SOUND_EVENT_1,
    LEVEL_SOUND_EVENT_2,
    LOGIN,
    MAP_CREATE_LOCKED_COPY,
    MAP_INFO_REQUEST,
    MOB_ARMOR_EQUIPMENT,
    MOB_EFFECT,
    MOB_EQUIPMENT,
    MODAL_FORM_REQUEST,
    MODAL_FORM_RESPONSE,
    MOVE_ENTITY_ABSOLUTE,
    MOVE_ENTITY_DELTA,
    MOVE_PLAYER,
    MULTIPLAYER_SETTINGS,
    NETWORK_CHUNK_PUBLISHER_UPDATE,
    NETWORK_SETTINGS,
    NETWORK_STACK_LATENCY,
    NPC_DIALOGUE,
    NPC_REQUEST,
    ON_SCREEN_TEXTURE_ANIMATION,
    PACKET_VIOLATION_WARNING,
    PHOTO_INFO_REQUEST,
    PHOTO_TRANSFER,
    PLAYER_ACTION,
    PLAYER_ARMOR_DAMAGE,
    PLAYER_AUTH_INPUT,
    PLAYER_ENCHANT_OPTIONS,
    PLAYER_FOG,
    PLAYER_HOTBAR,
    PLAYER_INPUT,
    PLAYER_LIST,
    PLAYER_SKIN,
    PLAYER_START_ITEM_COOLDOWN,
    PLAY_SOUND,
    PLAY_STATUS,
    PURCHASE_RECEIPT,
    POSITION_TRACKING_DB_SERVER_BROADCAST,
    POSITION_TRACKING_DB_CLIENT_REQUEST,
    REMOVE_ENTITY,
    REMOVE_OBJECTIVE,
    REMOVE_VOLUME_ENTITY,
    REQUEST_ABILITY,
    REQUEST_CHUNK_RADIUS,
    REQUEST_PERMISSIONS,
    RESOURCE_PACK_CHUNK_DATA,
    RESOURCE_PACK_CHUNK_REQUEST,
    RESOURCE_PACK_CLIENT_RESPONSE,
    RESOURCE_PACK_DATA_INFO,
    RESOURCE_PACKS_INFO,
    RESOURCE_PACK_STACK,
    RESPAWN,
    RIDER_JUMP,
    SCRIPT_CUSTOM_EVENT,
    SCRIPT_MESSAGE,
    SERVER_SETTINGS_REQUEST,
    SERVER_SETTINGS_RESPONSE,
    SERVER_TO_CLIENT_HANDSHAKE,
    SET_COMMANDS_ENABLED,
    SET_DEFAULT_GAME_TYPE,
    SET_DIFFICULTY,
    SET_DISPLAY_OBJECTIVE,
    SET_ENTITY_DATA,
    SET_ENTITY_LINK,
    SET_ENTITY_MOTION,
    SET_ENTITY_MOTION_PLUS,
    SET_HEALTH,
    SET_LAST_HURT_BY,
    SET_LOCAL_PLAYER_AS_INITIALIZED,
    SET_PLAYER_GAME_TYPE,
    SET_SCOREBOARD_IDENTITY,
    SET_SCORE,
    SET_SPAWN_POSITION,
    SET_TIME,
    SETTINGS_COMMAND,
    SET_TITLE,
    SHOW_CREDITS,
    SHOW_PROFILE,
    SHOW_STORE_OFFER,
    SIMPLE_EVENT,
    SIMULATION_TYPE,
    SPAWN_EXPERIENCE_ORB,
    SPAWN_PARTICLE_EFFECT,
    START_GAME,
    STOP_SOUND,
    STRUCTURE_BLOCK_UPDATE,
    STRUCTURE_TEMPLATE_DATA_EXPORT_REQUEST,
    STRUCTURE_TEMPLATE_DATA_EXPORT_RESPONSE,
    SUB_CHUNK,
    SUB_CHUNK_REQUEST,
    SUB_CLIENT_LOGIN,
    SYNC_ENTITY_PROPERTY,
    TAKE_ITEM_ENTITY,
    TEXT,
    TICK_SYNC,
    TICKING_AREAS_LOAD_STATUS,
    TOAST_REQUEST,
    TRANSFER,
    UNKNOWN,
    UPDATE_ATTRIBUTES,
    UPDATE_BLOCK,
    UPDATE_BLOCK_PROPERTIES,
    UPDATE_BLOCK_SYNCED,
    UPDATE_EQUIP,
    UPDATE_PLAYER_GAME_TYPE,
    UPDATE_SOFT_ENUM,
    UPDATE_SUB_CHUNK_BLOCKS,
    UPDATE_TRADE,
    VIDEO_STREAM_CONNECT
}
