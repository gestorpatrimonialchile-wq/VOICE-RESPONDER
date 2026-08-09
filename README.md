# VoiceReply V1

Aplicación Android base para detectar notificaciones y preparar respuestas asistidas por IA.

## Funciones V1

- Detección mediante NotificationListenerService.
- Identificación de notificaciones que ofrecen respuesta.
- Preparación para RemoteInput.
- Flujo de respuesta asistida por IA.
- Proyecto preparado para GitHub Actions.
- Generación automática de APK debug.

## Importante

La integración con IA requiere conectar un proveedor/API. En esta V1 se deja la arquitectura preparada para incorporar el proveedor que elijas sin guardar claves dentro del APK.

## Cómo generar el APK

1. Sube este proyecto a un repositorio de GitHub.
2. Abre **Actions**.
3. Ejecuta **Build VoiceReply APK**.
4. Descarga el artefacto `VoiceReply-debug-apk`.

## Permisos

Android requiere que el usuario active manualmente el acceso a notificaciones desde Ajustes.
